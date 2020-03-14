package com.yzeng.qf.controller;

import com.yzeng.qf.constant.UrlConstant;
import com.yzeng.qf.pojo.model.ModelDomain;
import com.yzeng.qf.pojo.model.PictureDomain;
import com.yzeng.qf.service.ModelService;
import com.yzeng.qf.service.PictureService;
import com.yzeng.qf.util.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ApiController {

    private PictureService pictureService;
    private ModelService modelService;

    @Autowired
    public ApiController(PictureService pictureService, ModelService modelService) {
        this.pictureService = pictureService;
        this.modelService = modelService;
    }

    @RequestMapping(value = UrlConstant.Api.GET_CATEGORY_DATA)
    @ResponseBody
    public APIResponse getCategoryData(@RequestParam("productId") Integer product_id) {
        List<PictureDomain> picture = pictureService.getPictureByProductId(product_id);
        return APIResponse.success("奇服商城", picture);
    }

    @PostMapping(value = UrlConstant.Api.GET_MODEL_DATA)
    @ResponseBody
    public APIResponse saveModelData(@RequestBody ModelDomain model) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置日期格式
        model.setCreate_time(df.format(new Date())); // 插入当前时间
        if (modelService.addModelByUserId(model) == 1) {
            return APIResponse.success("设计稿存储成功");
        } else {
            return APIResponse.fail("设计稿存储失败");
        }
    }

    @GetMapping(value = UrlConstant.Api.POST_MODEL_DATA)
    @ResponseBody
    public List<ModelDomain> giveModelData(@RequestParam("user_id") Integer userId) {
        return modelService.queryModelByUserId(userId);
    }

    @GetMapping(value = UrlConstant.Api.CUR_MODEL_DATA)
    @ResponseBody
    public ModelDomain getModelById(@RequestParam("model_id") Integer modelId) {
        return modelService.queryModelByModelId(modelId);
    }
}
