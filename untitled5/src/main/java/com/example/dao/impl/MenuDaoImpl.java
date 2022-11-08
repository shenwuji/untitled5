package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.IMenuDao;
import com.example.entity.Menu;
import com.example.utils.FileUtils;

import java.util.List;

public class MenuDaoImpl implements IMenuDao {
    @Override
    public List<Menu> setMenu() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("menu");
        List<Menu> menu= JSONObject.parseArray(result,Menu.class);
        return menu;
    }
}
