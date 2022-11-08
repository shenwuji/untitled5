package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.ISchoolDao;
import com.example.entity.School;
import com.example.utils.FileUtils;

public class SchoolDaoImpl implements ISchoolDao {
    @Override
    public School setSchool() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("school");
        School school=JSONObject.parseObject(result,School.class);
        return school;
    }
}
