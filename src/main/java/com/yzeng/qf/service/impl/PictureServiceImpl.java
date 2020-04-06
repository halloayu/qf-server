package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.PictureDao;
import com.yzeng.qf.pojo.model.PictureDomain;
import com.yzeng.qf.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

    private final PictureDao pictureDao; // 通过构造器强制注入

    @Autowired
    public PictureServiceImpl(PictureDao pictureDao) {
        this.pictureDao = pictureDao;
    }

    @Override
    public List<PictureDomain> getAllPictures(List<String> list) {
        List<PictureDomain> pictures = new ArrayList<>();
        for (String s : list) {
            PictureDomain pictureDomain = pictureDao.getPictureById(Integer.parseInt(s));
            pictures.add(pictureDomain);
        }
        return pictures;
    }

    @Override
    public List<PictureDomain> getPictureByProductId(Integer product_id) {
        return pictureDao.queryPictureByProductId(product_id);
    }

    @Override
    public List<PictureDomain> getPictureByUserId(Integer user_id) {
        return pictureDao.queryPictureByUserId(user_id);
    }

    @Override
    public List<PictureDomain> getPictureByOrderId(Integer order_id) {
        return pictureDao.queryPictureByOrderId(order_id);
    }
}
