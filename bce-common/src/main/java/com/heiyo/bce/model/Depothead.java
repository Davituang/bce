package com.heiyo.bce.model;

import java.util.Date;

public class Depothead {
    private Long id;

    private String type;

    private String subtype;

    private Long projectid;

    private String defaultnumber;

    private String number;

    private String operpersonname;

    private Date createtime;

    private Date opertime;

    private Long organid;

    private Long handspersonid;

    private Long accountid;

    private Double changeamount;

    private Long allocationprojectid;

    private Double totalprice;

    private String paytype;

    private String remark;

    private String salesman;

    private String accountidlist;

    private String accountmoneylist;

    private Double discount;

    private Double discountmoney;

    private Double discountlastmoney;

    private Double othermoney;

    private String othermoneylist;

    private String othermoneyitem;

    private Integer accountday;

    private Boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype == null ? null : subtype.trim();
    }

    public Long getProjectid() {
        return projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    public String getDefaultnumber() {
        return defaultnumber;
    }

    public void setDefaultnumber(String defaultnumber) {
        this.defaultnumber = defaultnumber == null ? null : defaultnumber.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getOperpersonname() {
        return operpersonname;
    }

    public void setOperpersonname(String operpersonname) {
        this.operpersonname = operpersonname == null ? null : operpersonname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public Long getOrganid() {
        return organid;
    }

    public void setOrganid(Long organid) {
        this.organid = organid;
    }

    public Long getHandspersonid() {
        return handspersonid;
    }

    public void setHandspersonid(Long handspersonid) {
        this.handspersonid = handspersonid;
    }

    public Long getAccountid() {
        return accountid;
    }

    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    public Double getChangeamount() {
        return changeamount;
    }

    public void setChangeamount(Double changeamount) {
        this.changeamount = changeamount;
    }

    public Long getAllocationprojectid() {
        return allocationprojectid;
    }

    public void setAllocationprojectid(Long allocationprojectid) {
        this.allocationprojectid = allocationprojectid;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
    }

    public String getAccountidlist() {
        return accountidlist;
    }

    public void setAccountidlist(String accountidlist) {
        this.accountidlist = accountidlist == null ? null : accountidlist.trim();
    }

    public String getAccountmoneylist() {
        return accountmoneylist;
    }

    public void setAccountmoneylist(String accountmoneylist) {
        this.accountmoneylist = accountmoneylist == null ? null : accountmoneylist.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountmoney() {
        return discountmoney;
    }

    public void setDiscountmoney(Double discountmoney) {
        this.discountmoney = discountmoney;
    }

    public Double getDiscountlastmoney() {
        return discountlastmoney;
    }

    public void setDiscountlastmoney(Double discountlastmoney) {
        this.discountlastmoney = discountlastmoney;
    }

    public Double getOthermoney() {
        return othermoney;
    }

    public void setOthermoney(Double othermoney) {
        this.othermoney = othermoney;
    }

    public String getOthermoneylist() {
        return othermoneylist;
    }

    public void setOthermoneylist(String othermoneylist) {
        this.othermoneylist = othermoneylist == null ? null : othermoneylist.trim();
    }

    public String getOthermoneyitem() {
        return othermoneyitem;
    }

    public void setOthermoneyitem(String othermoneyitem) {
        this.othermoneyitem = othermoneyitem == null ? null : othermoneyitem.trim();
    }

    public Integer getAccountday() {
        return accountday;
    }

    public void setAccountday(Integer accountday) {
        this.accountday = accountday;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}