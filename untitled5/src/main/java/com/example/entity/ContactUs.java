package com.example.entity;

public class ContactUs {
    private Integer cId;
    private String cImg;
    private String cLogo;
    private String cName;

    public ContactUs() {
    }

    public ContactUs(Integer cId, String cImg, String cLogo, String cName) {
        this.cId = cId;
        this.cImg = cImg;
        this.cLogo = cLogo;
        this.cName = cName;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcImg() {
        return cImg;
    }

    public void setcImg(String cImg) {
        this.cImg = cImg;
    }

    public String getcLogo() {
        return cLogo;
    }

    public void setcLogo(String cLogo) {
        this.cLogo = cLogo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "ContactUs{" +
                "cId=" + cId +
                ", cImg='" + cImg + '\'' +
                ", cLogo='" + cLogo + '\'' +
                ", cName='" + cName + '\'' +
                '}';
    }
}
