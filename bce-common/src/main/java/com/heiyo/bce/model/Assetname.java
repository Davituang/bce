package com.heiyo.bce.model;

public class Assetname {
    private Long id;

    private String assetname;

    private Long assetcategoryid;

    private Short isystem;

    private Short isconsumables;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname == null ? null : assetname.trim();
    }

    public Long getAssetcategoryid() {
        return assetcategoryid;
    }

    public void setAssetcategoryid(Long assetcategoryid) {
        this.assetcategoryid = assetcategoryid;
    }

    public Short getIsystem() {
        return isystem;
    }

    public void setIsystem(Short isystem) {
        this.isystem = isystem;
    }

    public Short getIsconsumables() {
        return isconsumables;
    }

    public void setIsconsumables(Short isconsumables) {
        this.isconsumables = isconsumables;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}