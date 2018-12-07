package com.heiyo.bce.model;

public class Accountitem {
    private Long id;

    private Long headerid;

    private Long accountid;

    private Long inoutitemid;

    private Double eachamount;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHeaderid() {
        return headerid;
    }

    public void setHeaderid(Long headerid) {
        this.headerid = headerid;
    }

    public Long getAccountid() {
        return accountid;
    }

    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    public Long getInoutitemid() {
        return inoutitemid;
    }

    public void setInoutitemid(Long inoutitemid) {
        this.inoutitemid = inoutitemid;
    }

    public Double getEachamount() {
        return eachamount;
    }

    public void setEachamount(Double eachamount) {
        this.eachamount = eachamount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}