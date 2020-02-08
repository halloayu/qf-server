package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.SizeDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SizeDao {
    /**
     * 通过 user_id 添加记录
     * @param user_id 用户ID
     */
    void addSizeByUserId(@Param("user_id") Integer user_id);

    /**
     * 通过 id 删除记录
     * @param size_id ID
     */
    void deleteSizeById(@Param("size_id") Integer size_id);

    /**
     * 通过 id 更新记录
     * @param size_id ID
     */
    void updateSizeById(@Param("size_id") Integer size_id);

    /**
     * 通过 user_id 查找记录
     * @param user_id 用户ID
     * @return 记录
     */
    SizeDomain querySizeByUserId(@Param("user_id") Integer user_id);
}
