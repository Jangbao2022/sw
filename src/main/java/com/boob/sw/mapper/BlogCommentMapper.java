package com.boob.sw.mapper;

import com.boob.sw.model.BlogComment;
import com.boob.sw.model.BlogCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BlogCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    long countByExample(BlogCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int deleteByExample(BlogCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int insert(BlogComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int insertSelective(BlogComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    List<BlogComment> selectByExampleWithRowbounds(BlogCommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    List<BlogComment> selectByExample(BlogCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    BlogComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") BlogComment record, @Param("example") BlogCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByExample(@Param("record") BlogComment record, @Param("example") BlogCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByPrimaryKeySelective(BlogComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_comment
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    int updateByPrimaryKey(BlogComment record);
}