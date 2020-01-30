package com.boob.sw.utils;

import com.boob.sw.enums.GlobalEnum;
import com.boob.sw.enums.MessageTypeEnum;
import org.springframework.ui.Model;

public class MessageUtils {

    /**
     * 通用放置message
     *
     * @return
     */
    public static void addMessage(boolean b, Model model) {
        model.addAttribute(MessageTypeEnum.HAVE_MESSAGE.getType(), true);
        if (b) {
            model.addAttribute(MessageTypeEnum.SUCCESS_MESSAGE.getType(), GlobalEnum.OPERATE_SUCCESS.getMessage());
        } else {
            model.addAttribute(MessageTypeEnum.ERROR_MESSAGE.getType(), GlobalEnum.OPERATE_FAIL.getMessage());

        }
    }

}
