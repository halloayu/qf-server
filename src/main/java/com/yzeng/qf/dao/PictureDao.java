package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.PictureDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PictureDao {

    // 通过ID获取图片
    PictureDomain getPictureById(@Param("picture_id") Integer picture_id);

    // 通过用户ID查询图片
    List<PictureDomain> queryPictureByUserId(@Param("user_id") Integer user_id);

    // 通过产品ID查询图片
    List<PictureDomain> queryPictureByProductId(@Param("product_id") Integer product_id);

    // 通过订单ID查询图片
    List<PictureDomain> queryPictureByOrderId(@Param("order_id") Integer order_id);
}
