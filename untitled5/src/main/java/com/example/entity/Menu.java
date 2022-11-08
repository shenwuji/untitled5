package com.example.entity;

public class Menu {
    private Integer mID;
    private String mName;
    private String mUrl;

    public Menu() {
    }

    public Menu(Integer mID, String mName, String mUrl) {
        this.mID = mID;
        this.mName = mName;
        this.mUrl = mUrl;
    }

    public Integer getmID() {
        return mID;
    }

    public void setmID(Integer mID) {
        this.mID = mID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mID=" + mID +
                ", mName='" + mName + '\'' +
                ", mUrl='" + mUrl + '\'' +
                '}';
    }
}
