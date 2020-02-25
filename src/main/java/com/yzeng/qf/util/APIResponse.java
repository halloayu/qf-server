package com.yzeng.qf.util;

/**
 * 返回的参数封装类
 */
public class APIResponse <T> {

    private static final Integer CODE_SUCCESS = 1; // 成功的状态码

    private static final Integer CODE_FAIL = 0; // 失败的状态码

    private Integer code; // 状态码
    private String msg; // 信息
    private T data;     // 数据

    public APIResponse(){
    }

    public APIResponse(Integer code){
        this.code = code;
    }

    public APIResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public APIResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static APIResponse success(){
        return new APIResponse(CODE_SUCCESS);
    }

    public static APIResponse success(String msg, Object data){
        return new APIResponse(CODE_SUCCESS, msg, data);
    }

    public static APIResponse success(Integer code, String msg, Object data){
        return new APIResponse(code, msg, data);
    }

    public static APIResponse fail(String msg){
        return new APIResponse(CODE_FAIL, msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

