package com.dianrong.common.uniauth.server.data.entity;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.value
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.perm_type_id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    private Integer permTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.domain_id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    private Integer domainId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.status
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.id
     *
     * @return the value of permission.id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.id
     *
     * @param id the value for permission.id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.value
     *
     * @return the value of permission.value
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.value
     *
     * @param value the value for permission.value
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.perm_type_id
     *
     * @return the value of permission.perm_type_id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public Integer getPermTypeId() {
        return permTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.perm_type_id
     *
     * @param permTypeId the value for permission.perm_type_id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public void setPermTypeId(Integer permTypeId) {
        this.permTypeId = permTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.domain_id
     *
     * @return the value of permission.domain_id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.domain_id
     *
     * @param domainId the value for permission.domain_id
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.status
     *
     * @return the value of permission.status
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.status
     *
     * @param status the value for permission.status
     *
     * @mbggenerated Fri Jan 15 14:30:43 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}