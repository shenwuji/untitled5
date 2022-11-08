package com.example.service.Impl;

import com.example.dao.IIdexDao;
import com.example.dao.IMenuDao;
import com.example.dao.impl.IndexDaoImpl;
import com.example.dao.impl.MenuDaoImpl;
import com.example.entity.Index;
import com.example.entity.Menu;
import com.example.service.IIndexService;

import java.util.List;

public class IndexServiceImpl implements IIndexService {
    @Override
    public List<Index> getIndex() {
        IIdexDao iIndexDao=new IndexDaoImpl();
        List<Index> index=iIndexDao.setIndex();
        return index;
    }
}
