package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.ProductDao;
import com.yzeng.qf.pojo.model.ProductDomain;
import com.yzeng.qf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public ProductDomain getProduct(Integer product_id) {
        return productDao.queryProduct(product_id, 1);
    }

    @Override
    public List<ProductDomain> searchProductByName(String name) {
        return productDao.searchProductByName(name);
    }
}
