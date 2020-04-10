package com.wxy.buyplus.model;

import java.util.Date;

public class Goods {
    private String id;

    private String title;

    private String url;

    private String price;

    private String releaseTime;

    private Date currentTime;

    private String classI;

    private String classIi;

    private String classIii;

    private String classIv;

    private String mall;

    private String brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime == null ? null : releaseTime.trim();
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public String getClassI() {
        return classI;
    }

    public void setClassI(String classI) {
        this.classI = classI == null ? null : classI.trim();
    }

    public String getClassIi() {
        return classIi;
    }

    public void setClassIi(String classIi) {
        this.classIi = classIi == null ? null : classIi.trim();
    }

    public String getClassIii() {
        return classIii;
    }

    public void setClassIii(String classIii) {
        this.classIii = classIii == null ? null : classIii.trim();
    }

    public String getClassIv() {
        return classIv;
    }

    public void setClassIv(String classIv) {
        this.classIv = classIv == null ? null : classIv.trim();
    }

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall == null ? null : mall.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }
}