package com.boob.sw.mapper;

import com.boob.sw.model.Good;
import com.boob.sw.model.GoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    long countByExample(GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int deleteByExample(GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int insert(Good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int insertSelective(Good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    List<Good> selectByExampleWithRowbounds(GoodExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    List<Good> selectByExample(GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    Good selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByPrimaryKeySelective(Good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByPrimaryKey(Good record);
}