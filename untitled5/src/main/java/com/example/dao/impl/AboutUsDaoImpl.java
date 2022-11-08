package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.IAboutUsDao;
import com.example.entity.AboutUs;
import com.example.entity.Menu;
import com.example.utils.FileUtils;

import java.util.List;

public class AboutUsDaoImpl implements IAboutUsDao {
    @Override
    public AboutUs setmsg() {

        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("about");
        AboutUs aboutUs= JSONObject.parseObject(result,AboutUs.class);
        return aboutUs;
    }
}
