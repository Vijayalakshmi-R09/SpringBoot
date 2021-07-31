package com.app.Composite.entity;

import javax.persistence.Entity;

@Entity
public class HouseInfo extends UserInfo
{
    private String block;
    
    private String houseno;

    private String city;

    private String state;

    private Long zcode;

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getZcode() {
        return zcode;
    }

    public void setZcode(Long zcode) {
        this.zcode = zcode;
    }
}
