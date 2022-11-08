package com.example.entity;

public class School {
    private Integer sId;
    private String sCName;
    private String sEName;
    private String sWel;
    private String sTel;
    private String sEmail;
    private String sLogo;
    private String sImg;
    private String sTitle;
    private String sInfo;
    private String sCopyRight;

    public School() {
    }

    public School(Integer sId, String sCName, String sEName, String sWel, String sTel, String sEmail, String sLogo, String sImg, String sTitle, String sInfo, String sCopyRight) {
        this.sId = sId;
        this.sCName = sCName;
        this.sEName = sEName;
        this.sWel = sWel;
        this.sTel = sTel;
        this.sEmail = sEmail;
        this.sLogo = sLogo;
        this.sImg = sImg;
        this.sTitle = sTitle;
        this.sInfo = sInfo;
        this.sCopyRight = sCopyRight;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsCName() {
        return sCName;
    }

    public void setsCName(String sCName) {
        this.sCName = sCName;
    }

    public String getsEName() {
        return sEName;
    }

    public void setsEName(String sEName) {
        this.sEName = sEName;
    }

    public String getsWel() {
        return sWel;
    }

    public void setsWel(String sWel) {
        this.sWel = sWel;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsLogo() {
        return sLogo;
    }

    public void setsLogo(String sLogo) {
        this.sLogo = sLogo;
    }

    public String getsImg() {
        return sImg;
    }

    public void setsImg(String sImg) {
        this.sImg = sImg;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public String getsInfo() {
        return sInfo;
    }

    public void setsInfo(String sInfo) {
        this.sInfo = sInfo;
    }

    public String getsCopyRight() {
        return sCopyRight;
    }

    public void setsCopyRight(String sCopyRight) {
        this.sCopyRight = sCopyRight;
    }

    @Override
    public String toString() {
        return "School{" +
                "sId=" + sId +
                ", sCName='" + sCName + '\'' +
                ", sEName='" + sEName + '\'' +
                ", sWel='" + sWel + '\'' +
                ", sTel='" + sTel + '\'' +
                ", sEmail='" + sEmail + '\'' +
                ", sLogo='" + sLogo + '\'' +
                ", sImg='" + sImg + '\'' +
                ", sTitle='" + sTitle + '\'' +
                ", sInfo='" + sInfo + '\'' +
                ", sCopyRight='" + sCopyRight + '\'' +
                '}';
    }
}