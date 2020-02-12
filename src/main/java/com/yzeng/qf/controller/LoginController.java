package com.yzeng.qf.controller;


import com.yzeng.qf.constant.WebConstant;
import com.yzeng.qf.pojo.dto.UserDto;
import com.yzeng.qf.util.APIResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    //    @RequestMapping("/toLogin")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Model model, HttpSession session) {
//
//        System.out.println(""+username+password);
//        //具体业务
//        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
//            session.setAttribute("userSession", username);
//            return "redirect:/main";
//        } else {
//            // 返回失败信息
//            System.out.println("pw--" + password);
//            model.addAttribute("errMsg", "用户名或密码错误!");
//            return "index";
//        }
//        return null;
//    }

    @PostMapping("/admin/toLogin")
    @ResponseBody
    public APIResponse login(@RequestParam("username") String username,
                        @RequestParam("password") String password, HttpSession session) {
        UserDto user = new UserDto();
        user.setUser_id(1);
        user.setUsername("admin");
        user.setNickname("黑小虎");
        session.setAttribute("username", username);
        return APIResponse.success(WebConstant.Auth.LOGIN_SUCCESS, user);
    }

}
