package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.SupplierDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SupplierDao {

    /**
     * 根据ID查询所有供应商
     * @param supplier_id 供应商ID
     * @return list
     */
    SupplierDomain querySupplierById(@Param("supplier_id") Integer supplier_id, @Param("status") Integer status);
}
