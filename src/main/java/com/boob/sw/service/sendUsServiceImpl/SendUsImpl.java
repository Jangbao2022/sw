package com.boob.sw.service.sendUsServiceImpl;

import com.boob.sw.dto.PagesDto;
import com.boob.sw.enums.EveryPageElementCount;
import com.boob.sw.enums.PageUrlEnum;
import com.boob.sw.enums.UserTypeEnum;
import com.boob.sw.mapper.SendUsMapper;
import com.boob.sw.model.*;
import com.boob.sw.service.SendUsServiceDao;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SendUsImpl implements SendUsServiceDao {

    @Autowired
    private SendUsMapper sendUsMapper;

    @Override
    public boolean checkPower(User user) {

        //是不是管理员
        return UserTypeEnum.ADMINISTRATOR.getCode() <= user.getCategory();
    }

    @Override
    public PagesDto getPages(String page) {

        //创建pagesDto并注入url
        PagesDto<SendUs> pagesDto = new PagesDto<>(PageUrlEnum.US_SEND_US_PAGE.getUrl());

        //设置sendUs页面包含数
        pagesDto.setCONTAINS(EveryPageElementCount.SEND_US.getCount());

        //转换成合法页码
        Integer checkedPage = checkPage(page);

        //查询总blog数
        SendUsExample example = new SendUsExample();
        Integer totalBlog = (int) sendUsMapper.countByExample(example);

        //计算总页面 计算前后页 当前页
        pagesDto.countTotalPage(totalBlog);
        pagesDto.countPreAndAfter(checkedPage);

        //查询出所有blog 进行封装
        List<SendUs> sendUses = sendUsMapper.selectByExampleWithRowbounds(example, new RowBounds(checkedPage - 1, EveryPageElementCount.SEND_US.getCount()));
        pagesDto.setElements(sendUses);

        return pagesDto;
    }

    /**
     * 检查page合法性
     *
     * @param page
     * @return
     */
    @Override
    public Integer checkPage(String page) {
        Integer checkedPage;
        try {
            //如果解析失败
            checkedPage = Integer.parseInt(page);
        } catch (NumberFormatException e) {
            //返回第一页
            return 1;
        }
        //返回正常页
        return checkedPage;
    }

    @Override
    public boolean checkSendUs(SendUs sendUs, User user) {
        return user.getId().equals(sendUs.getuId());
    }

    @Override
    public boolean saveSendUs(SendUs sendUs) {
        //封装属性
        sendUs.setGmtCreated(new Date());
        sendUs.setGmtModified(sendUs.getGmtCreated());

        int insert = sendUsMapper.insert(sendUs);
        return insert == 1;
    }

    @Override
    public boolean delSendUs(Long sendUsId) {
        int delete = sendUsMapper.deleteByPrimaryKey(sendUsId);
        return delete == 1;
    }


}
