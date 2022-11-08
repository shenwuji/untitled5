package com.example.service.Impl;

import com.example.dao.IOnlineBookingDao;
import com.example.dao.ISchoolDao;
import com.example.dao.impl.OnlineBookingImpl;
import com.example.dao.impl.SchoolDaoImpl;
import com.example.entity.OnlineBooking;
import com.example.entity.School;
import com.example.service.IAboutUsService;
import com.example.service.IOnlineBookingService;
import com.example.service.ISchoolService;

public class OnlineBookingServiceImpl1 implements IOnlineBookingService {

    @Override
    public OnlineBooking getOnline() {
        IOnlineBookingDao iOnlineBookingDao=new OnlineBookingImpl();
        OnlineBooking onlineBooking=iOnlineBookingDao.setOnline();
        return onlineBooking;

    }
}
