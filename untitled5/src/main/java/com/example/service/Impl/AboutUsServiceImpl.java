package com.example.service.Impl;

import com.example.dao.IAboutUsDao;
import com.example.dao.ISchoolDao;
import com.example.dao.impl.AboutUsDaoImpl;
import com.example.dao.impl.SchoolDaoImpl;
import com.example.entity.AboutUs;
import com.example.service.IAboutUsService;
import com.example.service.ISchoolService;

public class AboutUsServiceImpl implements IAboutUsService {

    @Override
    public AboutUs getMsg() {
        IAboutUsDao iAboutUsDao=new AboutUsDaoImpl();
        AboutUs aboutUs=iAboutUsDao.setmsg();
        return aboutUs;
    }


}
