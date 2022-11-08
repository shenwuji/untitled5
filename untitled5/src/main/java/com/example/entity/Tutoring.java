package com.example.entity;

import sun.applet.AppletResourceLoader;

public class Tutoring {
    private Integer tId;
    private String tName;
    private String tUrl;

    public Tutoring() {
    }

    public Tutoring(Integer tId, String tName, String tUrl) {
        this.tId = tId;
        this.tName = tName;
        this.tUrl = tUrl;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl;
    }

    @Override
    public String toString() {
        return "Tutoring{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tUrl='" + tUrl + '\'' +
                '}';
    }
}
