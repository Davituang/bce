package com.heiyo.bce.model;

public class Material {
    private Long id;

    private Long categoryid;

    private String name;

    private String mfrs;

    private Double packing;

    private Double safetystock;

    private String model;

    private String standard;

    private String color;

    private String unit;

    private String remark;

    private Double retailprice;

    private Double lowprice;

    private Double presetpriceone;

    private Double presetpricetwo;

    private Long unitid;

    private String firstoutunit;

    private String firstinunit;

    private String pricestrategy;

    private Boolean enabled;

    private String otherfield1;

    private String otherfield2;

    private String otherfield3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMfrs() {
        return mfrs;
    }

    public void setMfrs(String mfrs) {
        this.mfrs = mfrs == null ? null : mfrs.trim();
    }

    public Double getPacking() {
        return packing;
    }

    public void setPacking(Double packing) {
        this.packing = packing;
    }

    public Double getSafetystock() {
        return safetystock;
    }

    public void setSafetystock(Double safetystock) {
        this.safetystock = safetystock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    public Double getLowprice() {
        return lowprice;
    }

    public void setLowprice(Double lowprice) {
        this.lowprice = lowprice;
    }

    public Double getPresetpriceone() {
        return presetpriceone;
    }

    public void setPresetpriceone(Double presetpriceone) {
        this.presetpriceone = presetpriceone;
    }

    public Double getPresetpricetwo() {
        return presetpricetwo;
    }

    public void setPresetpricetwo(Double presetpricetwo) {
        this.presetpricetwo = presetpricetwo;
    }

    public Long getUnitid() {
        return unitid;
    }

    public void setUnitid(Long unitid) {
        this.unitid = unitid;
    }

    public String getFirstoutunit() {
        return firstoutunit;
    }

    public void setFirstoutunit(String firstoutunit) {
        this.firstoutunit = firstoutunit == null ? null : firstoutunit.trim();
    }

    public String getFirstinunit() {
        return firstinunit;
    }

    public void setFirstinunit(String firstinunit) {
        this.firstinunit = firstinunit == null ? null : firstinunit.trim();
    }

    public String getPricestrategy() {
        return pricestrategy;
    }

    public void setPricestrategy(String pricestrategy) {
        this.pricestrategy = pricestrategy == null ? null : pricestrategy.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getOtherfield1() {
        return otherfield1;
    }

    public void setOtherfield1(String otherfield1) {
        this.otherfield1 = otherfield1 == null ? null : otherfield1.trim();
    }

    public String getOtherfield2() {
        return otherfield2;
    }

    public void setOtherfield2(String otherfield2) {
        this.otherfield2 = otherfield2 == null ? null : otherfield2.trim();
    }

    public String getOtherfield3() {
        return otherfield3;
    }

    public void setOtherfield3(String otherfield3) {
        this.otherfield3 = otherfield3 == null ? null : otherfield3.trim();
    }
}