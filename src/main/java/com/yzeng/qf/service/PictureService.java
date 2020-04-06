package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.PictureDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PictureService {

    /**
     * 获取list里所有图片ID指向的具体图片数据
     * @param list 图片ID列表
     * @return list
     */
    List<PictureDomain> getAllPictures(List<String> list);

    /**
     *  根据 产品ID 获取相应图片
     * @param product_id 产品ID
     * @return PictureDomain
     */
    List<PictureDomain> getPictureByProductId(Integer product_id);
    /**
     *  根据 用户ID 获取相应图片
     * @param user_id 产品ID
     * @return PictureDomain
     */
    List<PictureDomain> getPictureByUserId(Integer user_id);
    /**
     *  根据 订单ID 获取相应图片
     * @param order_id 产品ID
     * @return PictureDomain
     */
    List<PictureDomain> getPictureByOrderId(Integer order_id);

}
