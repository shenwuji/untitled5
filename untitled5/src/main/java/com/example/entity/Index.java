package com.example.entity;

public class Index {
    private Integer iId;
    private String iTitle;
    private String iDes;
    private String iImg;

    public Index() {
    }

    public Index(Integer iId, String iTitle, String iDes, String iImg) {
        this.iId = iId;
        this.iTitle = iTitle;
        this.iDes = iDes;
        this.iImg = iImg;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiTitle() {
        return iTitle;
    }

    public void setiTitle(String iTitle) {
        this.iTitle = iTitle;
    }

    public String getiDes() {
        return iDes;
    }

    public void setiDes(String iDes) {
        this.iDes = iDes;
    }

    public String getiImg() {
        return iImg;
    }

    public void setiImg(String iImg) {
        this.iImg = iImg;
    }

    @Override
    public String toString() {
        return "Index{" +
                "iId=" + iId +
                ", iTitle='" + iTitle + '\'' +
                ", iDes='" + iDes + '\'' +
                ", iImg='" + iImg + '\'' +
                '}';
    }
}
