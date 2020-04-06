package com.yzeng.qf.constant;

public interface UrlConstant {
    /**
     * 后台请求地址
     */
    interface Admin{
        String ADMIN_LOGIN = "/admin/toLogin";
        String ADMIN_INDEX = "/admin/index.html";
        String ADMIN_ADMINISTRATOR = "/admin/administrator.html";
        String ADMIN_CONSOLE = "/admin/console.html";
        String ADMIN_ADMINISTRATOR_INFO = "/admin/administrator-info.html";
        String ADMIN_NAVIGATIONS = "/admin/navigations";
    }

    interface Api{
        String GET_CATEGORY_LIST = "/api/getCategoryList";
        String GET_CATEGORY_DATA = "/api/getCategoryData";
        String GET_MODEL_DATA = "/api/factory";
        String POST_MODEL_DATA = "/api/models";
        String CUR_MODEL_DATA = "/api/model";
        String DELETE_MODEL = "/api/model/delete";
        String SAVE_TASK = "/api/task/save";
        String QUERY_TASK = "/api/task/query";
        String QUERY_SUPPLIER = "/api/supplier/query";
        String FIND_TASK = "api/task/id"; // 根据任务单ID查找
        String UPDATE_TASK = "api/task/update"; // 更新任务单
        String DELETE_TASK = "api/task/delete"; // 删除任务单
        String RELEASE_TASK = "api/task/release"; // 发布任务单
        String QUERY_RELEASED_TASK = "api/released/task/query"; // 查看所有已发布任务单
        String CANCEL_RELEASED_TASK = "api/released/task/cancel"; // 撤销已发布任务单
        String QUERY_VALID_FEEDBACK = "api/feedback/query/valid"; // 查看所有反馈单
        String QUERY_CANCEL_FEEDBACK = "api/feedback/query/cancel"; // 查看所有反馈单
        String CANCEL_FEEDBACK = "api/feedback/cancel"; // 撤销反馈单
        String DELETE_FEEDBACK = "api/feedback/delete"; // 删除反馈单
        String SEARCH_PRODUCT = "api/product/search"; // 搜索商品
        String PRODUCT_DETAIL = "api/product/detail"; // 搜索商品
        String PRODUCT_PICTURE = "api/product/picture"; // 搜索商品
        String USER_CHECK = "api/user/check"; // 检查用户名是否已存在
        String USER_REGISTER = "api/user/register"; // 注册用户
        String STORE_MODELS = "api/store/models"; // 获取店铺设计模型
        String PICTURES = "api/id/pictures"; // 根据ID获取所有图片

    }
}
