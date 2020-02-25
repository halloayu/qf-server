package com.yzeng.qf.controller;

import com.yzeng.qf.constant.UrlConstant;
import com.yzeng.qf.pojo.model.UserDomain;
import com.yzeng.qf.util.JsonUtil;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class IndexController {

    @GetMapping(value = UrlConstant.Admin.ADMIN_INDEX)
    public String toIndex(Authentication authentication, Model model) {
        UserDomain currentUser = (UserDomain) authentication.getPrincipal();
        model.addAttribute("username", currentUser.getUsername());
        return "/admin/index";
    }

    @RequestMapping(value = UrlConstant.Admin.ADMIN_CONSOLE)
    public String getConsole() {
        return "admin/console";
    }

    @RequestMapping(value = UrlConstant.Admin.ADMIN_ADMINISTRATOR_INFO)
    public String getAdministratorInfo(HttpServletRequest request, Model model) {

        return "admin/administrator-info";
    }

    /**
     * 请求左侧导航栏数据
     * 毕业设计，为节约时间暂时构造一个json传给index.html
     * @return json
     */
    @RequestMapping(value = UrlConstant.Admin.ADMIN_NAVIGATIONS)
    @ResponseBody
    public String getNavigations() {
        String jsonNav = "";
        try {
            jsonNav = JsonUtil.readJsonFile("src/main/resources/static/json/navs.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonNav;
    }

}
