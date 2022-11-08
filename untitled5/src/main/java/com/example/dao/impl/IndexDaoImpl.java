package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.IIdexDao;
import com.example.entity.Index;
import com.example.entity.Menu;
import com.example.utils.FileUtils;

import java.util.List;

public class IndexDaoImpl implements IIdexDao {
    @Override
    public List<Index> setIndex() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("index");
        List<Index> index= JSONObject.parseArray(result,Index.class);
        return index;
    }
}
