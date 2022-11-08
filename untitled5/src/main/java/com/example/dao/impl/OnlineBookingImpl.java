package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.IOnlineBookingDao;
import com.example.dao.ISchoolDao;
import com.example.entity.OnlineBooking;
import com.example.entity.School;
import com.example.utils.FileUtils;

public class OnlineBookingImpl implements IOnlineBookingDao {


    @Override
    public OnlineBooking setOnline() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("online");
        OnlineBooking onlineBooking=JSONObject.parseObject(result,OnlineBooking.class);
        return onlineBooking;
    }
}
