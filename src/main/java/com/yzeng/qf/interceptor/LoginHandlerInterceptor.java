//package com.yzeng.qf.interceptor;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class LoginHandlerInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        // 登录成功后，获得用户session
////        Object userSession = request.getSession().getAttribute("userSession");
////        System.out.println("session--" + userSession);
////        if (userSession == null) { // 没有登录
////            request.setAttribute("errMsg", "没有权限，请先登录！");
////            request.getRequestDispatcher("/").forward(request, response);
////            return false;
////        } else {
////            return true;
////        }
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}
