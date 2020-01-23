package com.boob.sw.model;

import java.util.Date;

public class Organization {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.id
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.name
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.country
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.interal
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private Integer interal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.created_time
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.member_num
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private Long memberNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.icon
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.show
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private String show;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.gmt_created
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.gmt_modified
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.description
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column organization.honor
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    private String honor;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.id
     *
     * @return the value of organization.id
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.id
     *
     * @param id the value for organization.id
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.name
     *
     * @return the value of organization.name
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.name
     *
     * @param name the value for organization.name
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.country
     *
     * @return the value of organization.country
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.country
     *
     * @param country the value for organization.country
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.interal
     *
     * @return the value of organization.interal
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public Integer getInteral() {
        return interal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.interal
     *
     * @param interal the value for organization.interal
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setInteral(Integer interal) {
        this.interal = interal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.created_time
     *
     * @return the value of organization.created_time
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.created_time
     *
     * @param createdTime the value for organization.created_time
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.member_num
     *
     * @return the value of organization.member_num
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public Long getMemberNum() {
        return memberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.member_num
     *
     * @param memberNum the value for organization.member_num
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setMemberNum(Long memberNum) {
        this.memberNum = memberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.icon
     *
     * @return the value of organization.icon
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.icon
     *
     * @param icon the value for organization.icon
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.show
     *
     * @return the value of organization.show
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public String getShow() {
        return show;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.show
     *
     * @param show the value for organization.show
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setShow(String show) {
        this.show = show == null ? null : show.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.gmt_created
     *
     * @return the value of organization.gmt_created
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.gmt_created
     *
     * @param gmtCreated the value for organization.gmt_created
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.gmt_modified
     *
     * @return the value of organization.gmt_modified
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.gmt_modified
     *
     * @param gmtModified the value for organization.gmt_modified
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.description
     *
     * @return the value of organization.description
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.description
     *
     * @param description the value for organization.description
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column organization.honor
     *
     * @return the value of organization.honor
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public String getHonor() {
        return honor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column organization.honor
     *
     * @param honor the value for organization.honor
     *
     * @mbg.generated Thu Jan 23 19:22:50 CST 2020
     */
    public void setHonor(String honor) {
        this.honor = honor == null ? null : honor.trim();
    }
}