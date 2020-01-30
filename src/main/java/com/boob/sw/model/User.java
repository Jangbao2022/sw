package com.boob.sw.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Long account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.description
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.category
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Integer category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.prohibit
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Date prohibit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account
     *
     * @return the value of user.account
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Long getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account
     *
     * @param account the value for user.account
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setAccount(Long account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar
     *
     * @return the value of user.avatar
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar
     *
     * @param avatar the value for user.avatar
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.description
     *
     * @return the value of user.description
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.description
     *
     * @param description the value for user.description
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.category
     *
     * @return the value of user.category
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.category
     *
     * @param category the value for user.category
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.prohibit
     *
     * @return the value of user.prohibit
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Date getProhibit() {
        return prohibit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.prohibit
     *
     * @param prohibit the value for user.prohibit
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setProhibit(Date prohibit) {
        this.prohibit = prohibit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_created
     *
     * @return the value of user.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_created
     *
     * @param gmtCreated the value for user.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_modified
     *
     * @return the value of user.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_modified
     *
     * @param gmtModified the value for user.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}