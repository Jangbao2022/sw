package com.boob.sw.service.sendUsServiceImpl;

import com.boob.sw.enums.UserTypeEnum;
import com.boob.sw.mapper.SendUsMapper;
import com.boob.sw.model.SendUs;
import com.boob.sw.model.SendUsExample;
import com.boob.sw.model.User;
import com.boob.sw.service.SendUsServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<SendUs> getAllSendUs() {

        List<SendUs> sendUses = sendUsMapper.selectByExample(new SendUsExample());

        return sendUses;
    }

    @Override
    public boolean saveSendUs(SendUs sendUs) {
        int insert = sendUsMapper.insert(sendUs);
        return insert == 1;
    }

    @Override
    public boolean delSendUs(Long sendUsId) {
        int delete = sendUsMapper.deleteByPrimaryKey(sendUsId);
        return delete == 1;
    }


}
