package com.yzeng.qf.controller;


import com.yzeng.qf.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class IndexController {

    @GetMapping("/admin/index.html")
    public String toIndex(HttpServletRequest request, Model model) {
        Object userSession = request.getSession().getAttribute("username");
        if (userSession == null) { // 没有登录
            return "redirect:/admin/login";
        }else {
            String username = "" + userSession;
            model.addAttribute("username", username);
            return "/admin/index";
        }
    }

    @RequestMapping("/admin/administrator-info.html")
    @ResponseBody
    public String userInfo() {
        return "12121";
    }


    @RequestMapping("/templates/admin/console.html")
    public String getConsole() {
        return "admin/console";
    }

    @RequestMapping("/templates/admin/administrator-info.html")
    public String getAdministratorInfo() {
        return "admin/administrator-info";
    }

    /**
     * 请求左侧导航栏数据
     * @return json
     */
    @RequestMapping("/admin/navigations")
    @ResponseBody
    public String getNavigations() {
        String jsonNav = "null";
        try {
            jsonNav = JsonUtil.readJsonFile("src/main/java/com/yzeng/qf/constant/navs.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonNav;
    }

}
