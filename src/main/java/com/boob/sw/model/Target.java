package com.boob.sw.model;

import java.util.Date;

public class Target {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.u_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Long uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.push_target
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String pushTarget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.pull_target
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String pullTarget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.short_period_one
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String shortPeriodOne;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.short_period_two
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String shortPeriodTwo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.short_period_three
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String shortPeriodThree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column target.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.id
     *
     * @return the value of target.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.id
     *
     * @param id the value for target.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.u_id
     *
     * @return the value of target.u_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.u_id
     *
     * @param uId the value for target.u_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.push_target
     *
     * @return the value of target.push_target
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getPushTarget() {
        return pushTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.push_target
     *
     * @param pushTarget the value for target.push_target
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setPushTarget(String pushTarget) {
        this.pushTarget = pushTarget == null ? null : pushTarget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.pull_target
     *
     * @return the value of target.pull_target
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getPullTarget() {
        return pullTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.pull_target
     *
     * @param pullTarget the value for target.pull_target
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setPullTarget(String pullTarget) {
        this.pullTarget = pullTarget == null ? null : pullTarget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.short_period_one
     *
     * @return the value of target.short_period_one
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getShortPeriodOne() {
        return shortPeriodOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.short_period_one
     *
     * @param shortPeriodOne the value for target.short_period_one
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setShortPeriodOne(String shortPeriodOne) {
        this.shortPeriodOne = shortPeriodOne == null ? null : shortPeriodOne.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.short_period_two
     *
     * @return the value of target.short_period_two
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getShortPeriodTwo() {
        return shortPeriodTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.short_period_two
     *
     * @param shortPeriodTwo the value for target.short_period_two
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setShortPeriodTwo(String shortPeriodTwo) {
        this.shortPeriodTwo = shortPeriodTwo == null ? null : shortPeriodTwo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.short_period_three
     *
     * @return the value of target.short_period_three
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getShortPeriodThree() {
        return shortPeriodThree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.short_period_three
     *
     * @param shortPeriodThree the value for target.short_period_three
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setShortPeriodThree(String shortPeriodThree) {
        this.shortPeriodThree = shortPeriodThree == null ? null : shortPeriodThree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.gmt_created
     *
     * @return the value of target.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.gmt_created
     *
     * @param gmtCreated the value for target.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column target.gmt_modified
     *
     * @return the value of target.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column target.gmt_modified
     *
     * @param gmtModified the value for target.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}