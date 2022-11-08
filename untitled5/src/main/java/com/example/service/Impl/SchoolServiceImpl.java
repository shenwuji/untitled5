package com.example.service.Impl;

import com.example.dao.ISchoolDao;
import com.example.dao.impl.SchoolDaoImpl;
import com.example.entity.School;
import com.example.service.ISchoolService;
import com.sun.xml.internal.bind.unmarshaller.InfosetScanner;

public class SchoolServiceImpl implements ISchoolService {

    @Override
    public School getSchool() {
        ISchoolDao iSchoolDao=new SchoolDaoImpl();
        School school=iSchoolDao.setSchool();
        return school;
    }
}
