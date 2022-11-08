package com.example.entity;

public class OnlineBooking {
    private String bName;
    private String bThanks;
    private String bLogo;

    public OnlineBooking() {
    }

    public OnlineBooking(String bName, String bThanks, String bLogo) {
        this.bName = bName;
        this.bThanks = bThanks;
        this.bLogo = bLogo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbThanks() {
        return bThanks;
    }

    public void setbThanks(String bThanks) {
        this.bThanks = bThanks;
    }

    public String getbLogo() {
        return bLogo;
    }

    public void setbLogo(String bLogo) {
        this.bLogo = bLogo;
    }

    @Override
    public String toString() {
        return "OnlineBooking{" +
                "bName='" + bName + '\'' +
                ", bThanks='" + bThanks + '\'' +
                ", bLogo='" + bLogo + '\'' +
                '}';
    }
}
