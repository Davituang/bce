package com.heiyo.bce.model;

public class Depot {
    private Long id;

    private String name;

    private String address;

    private Double warehousing;

    private Double truckage;

    private Integer type;

    private String sort;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getWarehousing() {
        return warehousing;
    }

    public void setWarehousing(Double warehousing) {
        this.warehousing = warehousing;
    }

    public Double getTruckage() {
        return truckage;
    }

    public void setTruckage(Double truckage) {
        this.truckage = truckage;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}