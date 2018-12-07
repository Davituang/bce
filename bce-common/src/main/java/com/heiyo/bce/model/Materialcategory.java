package com.heiyo.bce.model;

public class Materialcategory {
    private Long id;

    private String name;

    private Short categorylevel;

    private Long parentid;

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

    public Short getCategorylevel() {
        return categorylevel;
    }

    public void setCategorylevel(Short categorylevel) {
        this.categorylevel = categorylevel;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }
}