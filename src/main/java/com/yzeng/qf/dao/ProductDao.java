package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.ProductDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductDao {

    ProductDomain queryProduct(@Param("product_id") Integer product_id, @Param("status") Integer status);

    /**
     * 查询所有商品
     * @return list
     */
    List<ProductDomain> queryProducts(@Param("product_id") Integer product_id);

    /**
     * 通过名字相似查找商品
     * @return list
     */
    List<ProductDomain> searchProductByName(@Param("name") String name);
}
