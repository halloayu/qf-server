package com.yzeng.qf.dao;

import com.yzeng.qf.pojo.model.ModelDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ModelDao {
    /**
     * 添加model
     * @param modelDomain model实体类
     * @return true or false
     */
    int addModelByUserId(ModelDomain modelDomain);

    /**
     * 根据ID获取该用户全部模型稿
     * @param user_id ID
     * @return list
     */
    List<ModelDomain> queryModelByUserId(@Param("user_id") Integer user_id);

    /**
     * 根据设计稿ID获取设计稿详细信息
     * @param model_id 设计稿ID
     * @return ModelDomain
     */
    ModelDomain queryModelByModelId(@Param("model_id") Integer model_id, @Param("status") Integer status);

    /**
     * 根据ID更新设计稿状态
     * @param model_id 设计稿ID
     */
    void updateStatusByModelId(@Param("model_id") Integer model_id, @Param("status") Integer status);
}
