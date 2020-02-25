package com.yzeng.qf.pojo.dto;

/**
 * 前端分类左侧导航条
 */
public class PictureDto {
    /**
     * 主键编号
     */
    private Integer picture_id;
    /**
     * url
     */
    private String picture_url;
    /**
     * 图片描述
     */
    private String picture_description;
    /**
     * 数据状态: 0无效 1有效
     */
    private Integer status;

    public Integer getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Integer picture_id) {
        this.picture_id = picture_id;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getPicture_description() {
        return picture_description;
    }

    public void setPicture_description(String picture_description) {
        this.picture_description = picture_description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
