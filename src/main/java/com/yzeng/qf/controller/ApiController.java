package com.yzeng.qf.controller;

import com.yzeng.qf.constant.UrlConstant;
import com.yzeng.qf.pojo.model.PictureDomain;
import com.yzeng.qf.service.PictureService;
import com.yzeng.qf.util.APIResponse;
import com.yzeng.qf.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
public class ApiController {

    @Autowired
    PictureService pictureService;
    /**
     * 前端分类页面左侧导航条
     * 毕业设计，为节约时间暂时构造一个json传给前端
     * @return json
     */
    @RequestMapping(value = UrlConstant.Api.GET_CATEGORY_LIST)
    @ResponseBody
    public String getCategoryList(){
        String jsonCategoryList = "{\"code\":0}"; // 默认code=0, 数据读取失败
        try {
            jsonCategoryList = JsonUtil.readJsonFile("src/main/resources/static/json/category-list.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonCategoryList;
    }

    @RequestMapping(value = UrlConstant.Api.GET_CATEGORY_DATA)
    @ResponseBody
    public APIResponse getCategoryData(@RequestParam("productId") Integer product_id){
        List<PictureDomain> picture = pictureService.getPictureByProductId(product_id);
        return APIResponse.success("奇服商城", picture);
    }
}
