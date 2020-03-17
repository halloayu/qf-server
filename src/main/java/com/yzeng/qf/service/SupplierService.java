package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.SupplierDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {
    /**
     * 根据ID查询所有有效供应商
     * @param supplier_id 供应商ID
     * @return list
     */
    SupplierDomain queryValidSupplierById(Integer supplier_id);

}
