package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.IMenuDao;
import com.example.dao.INewsDao;
import com.example.entity.Menu;
import com.example.entity.NewsCenter;
import com.example.utils.FileUtils;

import java.util.List;

public class NewsDaoImpl implements INewsDao {

    @Override
    public List<NewsCenter> setNews() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("news");
        List<NewsCenter> newsCenter= JSONObject.parseArray(result,NewsCenter.class);
        return newsCenter;
    }
}
