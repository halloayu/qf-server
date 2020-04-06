package com.yzeng.qf.service.impl;

import com.yzeng.qf.dao.ModelDao;
import com.yzeng.qf.pojo.model.ModelDomain;
import com.yzeng.qf.service.ModelService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    private final ModelDao modelDao;
    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    public ModelServiceImpl(ModelDao modelDao) {
        this.modelDao = modelDao;
    }


    @Override
    public int addModelByUserId(ModelDomain modelDomain) {
        try {
            modelDao.addModelByUserId(modelDomain);
            return 1;
        }catch(Exception e){
            logger.error(e);
        }
        return 0;
    }

    @Override
    public List<ModelDomain> queryModelByUserId(Integer user_id) {
        return modelDao.queryModelByUserId(user_id, 1);
    }

    @Override
    public ModelDomain queryValidModels(Integer model_id) {
        return modelDao.queryModelByModelId(model_id, 1);
    }

    @Override
    public void deleteByModelId(Integer model_id) {
        modelDao.updateStatusByModelId(model_id, 0); // 状态为0无效
    }

    @Override
    public void resurgenceByModelId(Integer model_id) {
        modelDao.updateStatusByModelId(model_id, 1); // 状态为1有效
    }

    @Override
    public List<ModelDomain> getModelsBySupplier(String supplierId) {
        return modelDao.queryModelByBelong(supplierId, 2);
    }

}
