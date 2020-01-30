package com.boob.sw.model;

import java.util.Date;

public class Goods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.score
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.c_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Long cId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.s_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Long sId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.old_price
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Float oldPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.new_price
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Double newPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.description
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.receive
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String receive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.reveal
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private String reveal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.score
     *
     * @return the value of goods.score
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.score
     *
     * @param score the value for goods.score
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.c_id
     *
     * @return the value of goods.c_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Long getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.c_id
     *
     * @param cId the value for goods.c_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setcId(Long cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.s_id
     *
     * @return the value of goods.s_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Long getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.s_id
     *
     * @param sId the value for goods.s_id
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setsId(Long sId) {
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.old_price
     *
     * @return the value of goods.old_price
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Float getOldPrice() {
        return oldPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.old_price
     *
     * @param oldPrice the value for goods.old_price
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setOldPrice(Float oldPrice) {
        this.oldPrice = oldPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.new_price
     *
     * @return the value of goods.new_price
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Double getNewPrice() {
        return newPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.new_price
     *
     * @param newPrice the value for goods.new_price
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.description
     *
     * @return the value of goods.description
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.description
     *
     * @param description the value for goods.description
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.receive
     *
     * @return the value of goods.receive
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getReceive() {
        return receive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.receive
     *
     * @param receive the value for goods.receive
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setReceive(String receive) {
        this.receive = receive == null ? null : receive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.reveal
     *
     * @return the value of goods.reveal
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public String getReveal() {
        return reveal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.reveal
     *
     * @param reveal the value for goods.reveal
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setReveal(String reveal) {
        this.reveal = reveal == null ? null : reveal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gmt_created
     *
     * @return the value of goods.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.gmt_created
     *
     * @param gmtCreated the value for goods.gmt_created
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gmt_modified
     *
     * @return the value of goods.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.gmt_modified
     *
     * @param gmtModified the value for goods.gmt_modified
     *
     * @mbg.generated Thu Jan 30 18:38:51 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}