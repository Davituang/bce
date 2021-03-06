package com.heiyo.bce.model;

import java.util.Date;

public class Asset {
    private Long id;

    private Long assetnameid;

    private String location;

    private String labels;

    private Short status;

    private Long userid;

    private Double price;

    private Date purchasedate;

    private Date periodofvalidity;

    private Date warrantydate;

    private String assetnum;

    private String serialnum;

    private Long supplier;

    private Date createtime;

    private Long creator;

    private Date updatetime;

    private Long updator;

    private String description;

    private String addmonth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssetnameid() {
        return assetnameid;
    }

    public void setAssetnameid(Long assetnameid) {
        this.assetnameid = assetnameid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public Date getPeriodofvalidity() {
        return periodofvalidity;
    }

    public void setPeriodofvalidity(Date periodofvalidity) {
        this.periodofvalidity = periodofvalidity;
    }

    public Date getWarrantydate() {
        return warrantydate;
    }

    public void setWarrantydate(Date warrantydate) {
        this.warrantydate = warrantydate;
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }

    public String getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum == null ? null : serialnum.trim();
    }

    public Long getSupplier() {
        return supplier;
    }

    public void setSupplier(Long supplier) {
        this.supplier = supplier;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getUpdator() {
        return updator;
    }

    public void setUpdator(Long updator) {
        this.updator = updator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAddmonth() {
        return addmonth;
    }

    public void setAddmonth(String addmonth) {
        this.addmonth = addmonth == null ? null : addmonth.trim();
    }
}