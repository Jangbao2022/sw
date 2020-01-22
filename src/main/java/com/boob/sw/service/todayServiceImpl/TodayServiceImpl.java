package com.boob.sw.service.todayServiceImpl;

import com.boob.sw.enums.TimeEnum;
import com.boob.sw.enums.UserEnum;
import com.boob.sw.exception.UserCustomizeException;
import com.boob.sw.mapper.TodayMapper;
import com.boob.sw.model.Today;
import com.boob.sw.model.TodayExample;
import com.boob.sw.service.TodayServiceDao;
import com.boob.sw.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Date;
import java.util.List;

/**
 * today service层
 */
@Service
public class TodayServiceImpl implements TodayServiceDao {

    //日期util

    @Autowired
    private TodayMapper todayMapper;

    @Override
    public Today getTodayByUid(Long userId) {

        Date currentTime = new Date();
        Date currentDate = DateUtils.parseTimeToDate(currentTime);
        TodayExample example = new TodayExample();
        //查出user在今天的today
        example.createCriteria()
                .andUIdEqualTo(userId)
                .andGmtModifiedBetween(currentDate, currentTime);

        List<Today> todays = todayMapper.selectByExample(example);
        if (todays.size() > 1) {
            throw new UserCustomizeException(UserEnum.USER_GOT_TWO_TODAY);
        } else if (todays.size() == 0) {
            return new Today();
        }
        return todays.get(0);
    }

    @Override
    public boolean insertToday(Today today) {

        today.setGmtCreated(new Date());
        today.setGmtModified(today.getGmtCreated());
        int insert = todayMapper.insert(today);
        return insert == 1;
    }

    @Override
    public boolean putToday(Today today, Today oldToday) {
        //直接放入
        //先把Id和创建时间封进去
        today.setId(oldToday.getId());
        today.setGmtCreated(oldToday.getGmtCreated());
        today.setGmtModified(new Date());
        int update = todayMapper.updateByPrimaryKey(today);
        return update == 1;
    }

    @Override
    public boolean changeToday(Today today) {

        //查询有没有旧的today
        TodayExample example = new TodayExample();
        example.createCriteria().andUIdEqualTo(today.getuId());
        List<Today> todays = todayMapper.selectByExample(example);

        if (todays.size() > 1) {
            throw new UserCustomizeException(UserEnum.USER_GOT_TWO_TODAY);
        } else if (todays.size() == 0) {
            //不存在插入
            return insertToday(today);
        } else {
            //存在就修改
            return putToday(today, todays.get(0));
        }
    }
}
