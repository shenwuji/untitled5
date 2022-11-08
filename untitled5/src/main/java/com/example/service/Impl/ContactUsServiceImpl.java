package com.example.service.Impl;

import com.example.dao.IContactUsDao;
import com.example.dao.IMenuDao;
import com.example.dao.impl.ContactUsDaoImpl;
import com.example.dao.impl.MenuDaoImpl;
import com.example.entity.ContactUs;
import com.example.entity.Menu;
import com.example.service.IContactUsService;
import com.example.service.IMenuService;

import java.util.List;

public class ContactUsServiceImpl implements IContactUsService {

    @Override
    public List<ContactUs> getContactUs() {
        IContactUsDao iContactUsDao=new ContactUsDaoImpl();
        List<ContactUs> contactUs=iContactUsDao.setContactUs();
        return contactUs;
    }
}
