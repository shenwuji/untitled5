package com.example.entity;

public class Img {
    private Integer imgId;
    private String imgName;
    private String imgUrl;

    public Img() {
    }

    public Img(Integer imgId, String imgName, String imgUrl) {
        this.imgId = imgId;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Img{" +
                "imgId=" + imgId +
                ", imgName='" + imgName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
