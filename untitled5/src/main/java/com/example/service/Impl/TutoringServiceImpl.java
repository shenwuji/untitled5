package com.example.service.Impl;

import com.example.dao.IMenuDao;
import com.example.dao.ITutoringDao;
import com.example.dao.impl.MenuDaoImpl;
import com.example.dao.impl.TutoringDaoImpl;
import com.example.entity.Menu;
import com.example.entity.Tutoring;
import com.example.service.ITutoringService;

import java.util.List;

public class TutoringServiceImpl implements ITutoringService {
    @Override
    public List<Tutoring> getTutoring() {
        ITutoringDao iTutoringDao=new TutoringDaoImpl();
        List<Tutoring> tutoring = iTutoringDao.setTutoring();
        return tutoring;
    }
}
