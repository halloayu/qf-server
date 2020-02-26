package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.PictureDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PictureService {
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
