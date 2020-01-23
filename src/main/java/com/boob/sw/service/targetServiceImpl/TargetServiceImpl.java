package com.boob.sw.service.targetServiceImpl;

import com.boob.sw.enums.UserEnum;
import com.boob.sw.exception.UserCustomizeException;
import com.boob.sw.mapper.TargetMapper;
import com.boob.sw.model.Target;
import com.boob.sw.model.TargetExample;
import com.boob.sw.service.TargetServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * target service层
 */
@Service
public class TargetServiceImpl implements TargetServiceDao {

    @Autowired
    private TargetMapper targetMapper;

    @Override
    public Target getTargetByUid(Long userId) {

        TargetExample example = new TargetExample();
        example.createCriteria().andUIdEqualTo(userId);
        List<Target> targets = targetMapper.selectByExample(example);

        if (targets.size() > 1) {
            throw new UserCustomizeException(UserEnum.USER_GOT_TWO_TARGET);
        } else if (targets.size() == 0) {
            return new Target();
        }
        return targets.get(0);
    }

    @Override
    public boolean insertTarget(Target target) {
        target.setGmtCreated(new Date());
        target.setGmtModified(target.getGmtCreated());
        int insert = targetMapper.insert(target);
        return insert == 1;

    }

    @Override
    public boolean changeTarget(Target target) {
        //查询有没有旧的today
        TargetExample example = new TargetExample();
        example.createCriteria().andUIdEqualTo(target.getuId());
        List<Target> targets = targetMapper.selectByExample(example);

        if (targets.size() > 1) {
            throw new UserCustomizeException(UserEnum.USER_GOT_TWO_TARGET);
        } else if (targets.size() == 0) {
            //不存在插入
            return insertTarget(target);
        } else {
            //存在就修改
            return putTarget(target, targets.get(0));
        }
    }

    @Override
    public boolean putTarget(Target target, Target oldTarget) {
        //直接放入
        //先把Id和创建时间封进去
        target.setId(oldTarget.getId());
        target.setGmtCreated(oldTarget.getGmtCreated());
        target.setGmtModified(new Date());
        int update = targetMapper.updateByPrimaryKey(target);
        return update == 1;
    }
}
