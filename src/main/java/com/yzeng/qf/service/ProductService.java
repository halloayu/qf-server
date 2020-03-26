package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.ProductDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    /**
     * 得到有效商品信息
     * @param product_id 商品ID
     * @return ProductDomain
     */
    ProductDomain getProduct(Integer product_id);

    /**
     * 通过名字相似查找商品
     * @return list
     */
    List<ProductDomain> searchProductByName(String name);
}
