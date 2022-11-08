package com.example.entity;

public class CurriculumCenter {
    private Integer kId;
    private String kUrl;
    private String kName;
    private String kOldPrice;
    private String kNewPrice;

    private String kOldName;
    private String kNewName;

    public CurriculumCenter() {
    }

    public CurriculumCenter(Integer kId, String kUrl, String kName, String kOldPrice, String kNewPrice, String kOldName, String kNewName) {
        this.kId = kId;
        this.kUrl = kUrl;
        this.kName = kName;
        this.kOldPrice = kOldPrice;
        this.kNewPrice = kNewPrice;
        this.kOldName = kOldName;
        this.kNewName = kNewName;
    }

    public String getkOldName() {
        return kOldName;
    }

    public void setkOldName(String kOldName) {
        this.kOldName = kOldName;
    }

    public String getkNewName() {
        return kNewName;
    }

    public void setkNewName(String kNewName) {
        this.kNewName = kNewName;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getkUrl() {
        return kUrl;
    }

    public void setkUrl(String kUrl) {
        this.kUrl = kUrl;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public String getkOldPrice() {
        return kOldPrice;
    }

    public void setkOldPrice(String kOldPrice) {
        this.kOldPrice = kOldPrice;
    }

    public String getkNewPrice() {
        return kNewPrice;
    }

    public void setkNewPrice(String kNewPrice) {
        this.kNewPrice = kNewPrice;
    }

    @Override
    public String toString() {
        return "CurriculumCenter{" +
                "kId=" + kId +
                ", kUrl='" + kUrl + '\'' +
                ", kName='" + kName + '\'' +
                ", kOldPrice='" + kOldPrice + '\'' +
                ", kNewPrice='" + kNewPrice + '\'' +
                ", kOldName='" + kOldName + '\'' +
                ", kNewName='" + kNewName + '\'' +
                '}';
    }
}
