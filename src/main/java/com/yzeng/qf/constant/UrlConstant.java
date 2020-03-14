package com.yzeng.qf.constant;

public interface UrlConstant {
    /**
     * 后台请求地址
     */
    interface Admin{
        public static final String ADMIN_LOGIN = "/admin/toLogin";
        public static final String ADMIN_INDEX = "/admin/index.html";
        public static final String ADMIN_ADMINISTRATOR = "/admin/administrator.html";
        public static final String ADMIN_CONSOLE = "/admin/console.html";
        public static final String ADMIN_ADMINISTRATOR_INFO = "/admin/administrator-info.html";
        public static final String ADMIN_NAVIGATIONS = "/admin/navigations";
    }

    interface Api{
        public static final String GET_CATEGORY_LIST = "/api/getCategoryList";
        public static final String GET_CATEGORY_DATA = "/api/getCategoryData";
        public static final String GET_MODEL_DATA = "/api/factory";
        public static final String POST_MODEL_DATA = "/api/models";
        public static final String CUR_MODEL_DATA = "/api/model";
    }
}
