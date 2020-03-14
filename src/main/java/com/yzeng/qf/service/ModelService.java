package com.yzeng.qf.service;

import com.yzeng.qf.pojo.model.ModelDomain;
import org.apache.ibatis.annotations.Param;
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
    ModelDomain queryModelByModelId(Integer model_id);
}
