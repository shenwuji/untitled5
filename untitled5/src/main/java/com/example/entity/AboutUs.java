package com.example.entity;

public class AboutUs {
    private Integer aId;
    private String aDes1;
    private String aDes2;
    private String aDes3;
    private String aCName;
    private String aEName;
    private String aImgUrl;

    public AboutUs() {
    }

    public AboutUs(Integer aId, String aDes1, String aDes2, String aDes3, String aCName, String aEName, String aImgUrl) {
        this.aId = aId;
        this.aDes1 = aDes1;
        this.aDes2 = aDes2;
        this.aDes3 = aDes3;
        this.aCName = aCName;
        this.aEName = aEName;
        this.aImgUrl = aImgUrl;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaDes1() {
        return aDes1;
    }

    public void setaDes1(String aDes1) {
        this.aDes1 = aDes1;
    }

    public String getaDes2() {
        return aDes2;
    }

    public void setaDes2(String aDes2) {
        this.aDes2 = aDes2;
    }

    public String getaDes3() {
        return aDes3;
    }

    public void setaDes3(String aDes3) {
        this.aDes3 = aDes3;
    }

    public String getaCName() {
        return aCName;
    }

    public void setaCName(String aCName) {
        this.aCName = aCName;
    }

    public String getaEName() {
        return aEName;
    }

    public void setaEName(String aEName) {
        this.aEName = aEName;
    }

    public String getaImgUrl() {
        return aImgUrl;
    }

    public void setaImgUrl(String aImgUrl) {
        this.aImgUrl = aImgUrl;
    }

    @Override
    public String toString() {
        return "AboutUs{" +
                "aId=" + aId +
                ", aDes1='" + aDes1 + '\'' +
                ", aDes2='" + aDes2 + '\'' +
                ", aDes3='" + aDes3 + '\'' +
                ", aCName='" + aCName + '\'' +
                ", aEName='" + aEName + '\'' +
                ", aImgUrl='" + aImgUrl + '\'' +
                '}';
    }
}
