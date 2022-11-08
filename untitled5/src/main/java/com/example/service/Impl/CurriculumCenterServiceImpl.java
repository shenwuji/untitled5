package com.example.service.Impl;

import com.example.dao.ICurriculumCenterDao;
import com.example.dao.IMenuDao;
import com.example.dao.impl.CurriculumCenterImpl;
import com.example.dao.impl.MenuDaoImpl;
import com.example.entity.CurriculumCenter;
import com.example.entity.Menu;
import com.example.service.ICurriculumCenterService;

import java.util.List;

public class CurriculumCenterServiceImpl implements ICurriculumCenterService {
    @Override
    public List<CurriculumCenter> getCurriculum() {
        ICurriculumCenterDao iCurriculumCenterDao=new CurriculumCenterImpl();
        List<CurriculumCenter> curriculumCenters=iCurriculumCenterDao.setCurriculum();
        return curriculumCenters;
    }
}
