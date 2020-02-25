package com.yzeng.qf.controller;

import com.yzeng.qf.constant.UrlConstant;
import com.yzeng.qf.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class ApiController {

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
    public String getCategoryData(@RequestParam("product_id") Integer product_id){

        return "212";
    }
}
