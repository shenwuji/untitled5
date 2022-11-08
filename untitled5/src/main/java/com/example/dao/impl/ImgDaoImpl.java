package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.IImgDao;
import com.example.entity.Img;
import com.example.utils.FileUtils;

import java.util.List;

public class ImgDaoImpl implements IImgDao {
    @Override
    public List<Img> setImg() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("img");
        List<Img> imgList = JSONObject.parseArray(result, Img.class);
        return imgList;
    }
}
