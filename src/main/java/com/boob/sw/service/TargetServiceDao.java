package com.boob.sw.service;


import com.boob.sw.model.Target;

public interface TargetServiceDao {

    /**
     * 通过userId获取Target
     *
     * @param userId
     * @return
     */
    Target getTargetByUid(Long userId);

    /**
     * 增加Target
     *
     * @param Target
     * @return
     */
    boolean insertTarget(Target Target);


    /**
     * 改变Target
     *
     * @param Target
     * @return
     */
    boolean changeTarget(Target Target);


    /**
     * 判断后修改Target
     *
     * @param Target
     * @param oldTarget
     * @return
     */
    boolean putTarget(Target Target, Target oldTarget);
}
