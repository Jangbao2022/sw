package com.boob.sw.mapper;

import com.boob.sw.model.Today;
import com.boob.sw.model.TodayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TodayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    long countByExample(TodayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int deleteByExample(TodayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int insert(Today record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int insertSelective(Today record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    List<Today> selectByExampleWithRowbounds(TodayExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    List<Today> selectByExample(TodayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    Today selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int updateByExampleSelective(@Param("record") Today record, @Param("example") TodayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int updateByExample(@Param("record") Today record, @Param("example") TodayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int updateByPrimaryKeySelective(Today record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table today
     *
     * @mbg.generated Thu Jan 23 18:51:15 CST 2020
     */
    int updateByPrimaryKey(Today record);
}