package com.example.service.Impl;

import com.example.dao.IImgDao;
import com.example.dao.impl.ImgDaoImpl;
import com.example.entity.Img;
import com.example.entity.Index;
import com.example.service.IImgService;
import com.example.service.IIndexService;

import java.util.List;

public class ImgServiceImpl implements IImgService {
    @Override
    public List<Img> getImg() {
        IImgDao iImgDao=new ImgDaoImpl();
        List<Img> imgList = iImgDao.setImg();
        return imgList;
    }
}
