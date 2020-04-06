package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.ModelDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModelService {
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
    List<ModelDomain> queryModelByUserId(Integer user_id);

    /**
     * 根据设计稿ID获取设计稿详细信息
     * @param model_id 设计稿ID
     * @return ModelDomain
     */
    ModelDomain queryValidModels(Integer model_id);

    /**
     * 根据ID删除设计稿
     * @param model_id 设计稿ID
     */
    void deleteByModelId(Integer model_id);

    /**
     * 根据ID生效设计稿
     * @param model_id 设计稿ID
     */
    void resurgenceByModelId(Integer model_id);

    /**
     * 获取该店铺开放的所有店铺设计模型
     * @param supplierId 店铺ID
     * @return list
     */
    List<ModelDomain> getModelsBySupplier(String supplierId);
}
