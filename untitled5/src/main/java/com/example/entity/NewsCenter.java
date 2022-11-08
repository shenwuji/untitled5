package com.example.entity;

public class NewsCenter {
    private Integer nId;
    private String nDatetime;
    private String nDaytime;
    private String nTitle;
    private String nDes;

    public NewsCenter() {
    }



    public NewsCenter(Integer nId,  String nDatetime, String nDaytime, String nTitle, String nDes) {
        this.nId = nId;
        this.nDatetime = nDatetime;
        this.nDaytime = nDaytime;
        this.nTitle = nTitle;
        this.nDes = nDes;
    }

    @Override
    public String toString() {
        return "NewsCenter{" +
                "nId=" + nId +
                ", nDatetime='" + nDatetime + '\'' +
                ", nDaytime='" + nDaytime + '\'' +
                ", nTitle='" + nTitle + '\'' +
                ", nDes='" + nDes + '\'' +
                '}';
    }

    public String getnDaytime() {
        return nDaytime;
    }

    public void setnDaytime(String nDaytime) {
        this.nDaytime = nDaytime;
    }

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }



    public String getnDatetime() {
        return nDatetime;
    }

    public void setnDatetime(String nDatetime) {
        this.nDatetime = nDatetime;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getnDes() {
        return nDes;
    }

    public void setnDes(String nDes) {
        this.nDes = nDes;
    }

}
