package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.ICurriculumCenterDao;
import com.example.entity.CurriculumCenter;
import com.example.entity.Menu;
import com.example.utils.FileUtils;

import java.util.List;

public class CurriculumCenterImpl implements ICurriculumCenterDao {
    @Override
    public List<CurriculumCenter> setCurriculum() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("curriculum");
        List<CurriculumCenter> curriculum= JSONObject.parseArray(result,CurriculumCenter.class);
        return curriculum;
    }
}
