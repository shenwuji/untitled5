package com.example.dao.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.dao.ITutoringDao;
import com.example.entity.Tutoring;
import com.example.utils.FileUtils;

import java.util.List;

public class TutoringDaoImpl implements ITutoringDao {
    @Override
    public List<Tutoring> setTutoring() {
        FileUtils fileUtils =FileUtils.getInstance();
        String result = fileUtils.getFileContent("tutor");
        List<Tutoring> tutoring = JSONObject.parseArray(result, Tutoring.class);
        return tutoring;


    }
}
