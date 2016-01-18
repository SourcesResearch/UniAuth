package com.dianrong.common.uniauth.server.data.entity;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password_salt
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private String passwordSalt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_login_time
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_login_ip
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private String lastLoginIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.fail_count
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private Byte failCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_date
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_update
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private Date lastUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password_date
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    private Date passwordDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
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
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
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
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
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
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password_salt
     *
     * @return the value of user.password_salt
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password_salt
     *
     * @param passwordSalt the value for user.password_salt
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_login_time
     *
     * @return the value of user.last_login_time
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_login_time
     *
     * @param lastLoginTime the value for user.last_login_time
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_login_ip
     *
     * @return the value of user.last_login_ip
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_login_ip
     *
     * @param lastLoginIp the value for user.last_login_ip
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.fail_count
     *
     * @return the value of user.fail_count
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public Byte getFailCount() {
        return failCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.fail_count
     *
     * @param failCount the value for user.fail_count
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setFailCount(Byte failCount) {
        this.failCount = failCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_date
     *
     * @return the value of user.create_date
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_date
     *
     * @param createDate the value for user.create_date
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_update
     *
     * @return the value of user.last_update
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_update
     *
     * @param lastUpdate the value for user.last_update
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password_date
     *
     * @return the value of user.password_date
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public Date getPasswordDate() {
        return passwordDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password_date
     *
     * @param passwordDate the value for user.password_date
     *
     * @mbggenerated Mon Jan 18 12:08:08 CST 2016
     */
    public void setPasswordDate(Date passwordDate) {
        this.passwordDate = passwordDate;
    }
}