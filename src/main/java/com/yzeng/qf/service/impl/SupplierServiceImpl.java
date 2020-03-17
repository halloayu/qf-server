package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.SupplierDao;
import com.yzeng.qf.pojo.model.SupplierDomain;
import com.yzeng.qf.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierDao supplierDao;

    @Autowired
    public SupplierServiceImpl(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    @Override
    public SupplierDomain queryValidSupplierById(Integer supplier_id) {
        return supplierDao.querySupplierById(supplier_id, 1);
    }


}
