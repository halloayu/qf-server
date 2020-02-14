package com.yzeng.qf.pojo.model;

public class PictureDomain {
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
     * 用户id
     */
    private Integer user_id;
    /**
     * 商品id
     */
    private Integer product_id;
    /**
     * 订单id
     */
    private Integer order_id;
    /**
     * 创建时间
     */
    private String create_time;
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

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PictureDomain{" +
                "picture_id=" + picture_id +
                ", picture_url='" + picture_url + '\'' +
                ", picture_description='" + picture_description + '\'' +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", order_id=" + order_id +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
