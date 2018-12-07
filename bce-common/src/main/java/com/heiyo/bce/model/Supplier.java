package com.heiyo.bce.model;

public class Supplier {
    private Long id;

    private String supplier;

    private String contacts;

    private String phonenum;

    private String email;

    private String description;

    private Byte isystem;

    private String type;

    private Boolean enabled;

    private Double advancein;

    private Double beginneedget;

    private Double beginneedpay;

    private Double allneedget;

    private Double allneedpay;

    private String fax;

    private String telephone;

    private String address;

    private String taxnum;

    private String bankname;

    private String accountnumber;

    private Double taxrate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getIsystem() {
        return isystem;
    }

    public void setIsystem(Byte isystem) {
        this.isystem = isystem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Double getAdvancein() {
        return advancein;
    }

    public void setAdvancein(Double advancein) {
        this.advancein = advancein;
    }

    public Double getBeginneedget() {
        return beginneedget;
    }

    public void setBeginneedget(Double beginneedget) {
        this.beginneedget = beginneedget;
    }

    public Double getBeginneedpay() {
        return beginneedpay;
    }

    public void setBeginneedpay(Double beginneedpay) {
        this.beginneedpay = beginneedpay;
    }

    public Double getAllneedget() {
        return allneedget;
    }

    public void setAllneedget(Double allneedget) {
        this.allneedget = allneedget;
    }

    public Double getAllneedpay() {
        return allneedpay;
    }

    public void setAllneedpay(Double allneedpay) {
        this.allneedpay = allneedpay;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTaxnum() {
        return taxnum;
    }

    public void setTaxnum(String taxnum) {
        this.taxnum = taxnum == null ? null : taxnum.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber == null ? null : accountnumber.trim();
    }

    public Double getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Double taxrate) {
        this.taxrate = taxrate;
    }
}