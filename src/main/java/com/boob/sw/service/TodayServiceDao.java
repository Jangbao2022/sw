package com.boob.sw.service;


import com.boob.sw.model.Today;

public interface TodayServiceDao {

    /**
     * 通过userId获取today
     *
     * @param userId
     * @return
     */
    Today getTodayByUid(Long userId);

    /**
     * 增加today
     *
     * @param today
     * @return
     */
    boolean insertToday(Today today);


    /**
     * 改变today
     *
     * @param today
     * @return
     */
    boolean changeToday(Today today);


    /**
     * 判断后修改today
     *
     * @param today
     * @param oldToday
     * @return
     */
    boolean putToday(Today today, Today oldToday);
}
