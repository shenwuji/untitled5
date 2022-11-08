package com.example.service.Impl;

import com.example.dao.IMenuDao;
import com.example.dao.ISchoolDao;
import com.example.dao.impl.MenuDaoImpl;
import com.example.dao.impl.SchoolDaoImpl;
import com.example.entity.Menu;
import com.example.entity.School;
import com.example.service.IMenuService;

import java.util.List;

public class MenuServiceImpl implements IMenuService {
    @Override
    public List<Menu> getMenu() {
        IMenuDao iMenuDao=new MenuDaoImpl();
        List<Menu> menu=iMenuDao.setMenu();
        return menu;
    }
}
