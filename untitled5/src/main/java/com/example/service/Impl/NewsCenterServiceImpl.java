package com.example.service.Impl;

import com.example.dao.INewsDao;
import com.example.dao.ISchoolDao;
import com.example.dao.impl.NewsDaoImpl;
import com.example.dao.impl.SchoolDaoImpl;
import com.example.entity.NewsCenter;
import com.example.entity.School;
import com.example.service.INewsCenterService;
import com.example.service.ISchoolService;

import java.util.List;

public class NewsCenterServiceImpl implements INewsCenterService {


    @Override
    public List<NewsCenter> getNews() {
        INewsDao iNewsDao=new NewsDaoImpl();
        List<NewsCenter> newsCenter=iNewsDao.setNews();
        return newsCenter;
    }
}
