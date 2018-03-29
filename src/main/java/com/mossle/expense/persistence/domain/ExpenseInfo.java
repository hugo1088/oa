package com.mossle.expense.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ExpenseInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "EXPENSE_INFO")
public class ExpenseInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private Date createTime;

    /** null. */
    private String status;

    /** null. */
    private String type;

    /** null. */
    private Double money;

    /** null. */
    private Date startTime;

    /** null. */
    private Date endTime;

    /** null. */
    private Integer headCount;

    /** null. */
    private String person;

    /** null. */
    private String traffic;

    /** null. */
    private String country;

    /** null. */
    private String address;

    /** null. */
    private String thing;

    /** null. */
    private String userId;

    /** null. */
    private String tenantId;

    public ExpenseInfo() {
    }

    public ExpenseInfo(Long id) {
        this.id = id;
    }

    public ExpenseInfo(Long id, String name, Date createTime, String status,
            String type, Double money, Date startTime, Date endTime,
            Integer headCount, String person, String traffic, String country,
            String address, String thing, String userId, String tenantId) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.status = status;
        this.type = type;
        this.money = money;
        this.startTime = startTime;
        this.endTime = endTime;
        this.headCount = headCount;
        this.person = person;
        this.traffic = traffic;
        this.country = country;
        this.address = address;
        this.thing = thing;
        this.userId = userId;
        this.tenantId = tenantId;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "MONEY", precision = 64, scale = 0)
    public Double getMoney() {
        return this.money;
    }

    /**
     * @param money
     *            null.
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", length = 26)
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            null.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME", length = 26)
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     *            null.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /** @return null. */
    @Column(name = "HEAD_COUNT")
    public Integer getHeadCount() {
        return this.headCount;
    }

    /**
     * @param headCount
     *            null.
     */
    public void setHeadCount(Integer headCount) {
        this.headCount = headCount;
    }

    /** @return null. */
    @Column(name = "PERSON", length = 200)
    public String getPerson() {
        return this.person;
    }

    /**
     * @param person
     *            null.
     */
    public void setPerson(String person) {
        this.person = person;
    }

    /** @return null. */
    @Column(name = "TRAFFIC", length = 100)
    public String getTraffic() {
        return this.traffic;
    }

    /**
     * @param traffic
     *            null.
     */
    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    /** @return null. */
    @Column(name = "COUNTRY", length = 100)
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
     *            null.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** @return null. */
    @Column(name = "ADDRESS", length = 100)
    public String getAddress() {
        return this.address;
    }

    /**
     * @param address
     *            null.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** @return null. */
    @Column(name = "THING", length = 100)
    public String getThing() {
        return this.thing;
    }

    /**
     * @param thing
     *            null.
     */
    public void setThing(String thing) {
        this.thing = thing;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
