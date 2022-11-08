package com.example.dao.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.IContactUsDao;
import com.example.dao.IMenuDao;
import com.example.entity.ContactUs;
import com.example.entity.Menu;
import com.example.utils.FileUtils;

import java.util.List;

public class ContactUsDaoImpl implements IContactUsDao {


    @Override
    public List<ContactUs> setContactUs() {
        FileUtils fileUtils=FileUtils.getInstance();
        String result = fileUtils.getFileContent("contact");
        List<ContactUs> contactUs= JSONObject.parseArray(result,ContactUs.class);
        return contactUs;
    }
}
