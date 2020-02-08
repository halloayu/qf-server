package com.yzeng.qf.pojo.model;

public class BrandDomain {
    /**
     * 主键编号
     */
    private Integer brand_id;
    /**
     * 品牌名称
     */
    private String brand_name;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 品牌网络
     */
    private String brand_web;
    /**
     * 品牌logo url
     */
    private String brand_logo;
    /**
     * 品牌描述
     */
    private String brand_description;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 数据状态: 0禁用 1启用
     */
    private Integer status;

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBrand_web() {
        return brand_web;
    }

    public void setBrand_web(String brand_web) {
        this.brand_web = brand_web;
    }

    public String getBrand_logo() {
        return brand_logo;
    }

    public void setBrand_logo(String brand_logo) {
        this.brand_logo = brand_logo;
    }

    public String getBrand_description() {
        return brand_description;
    }

    public void setBrand_description(String brand_description) {
        this.brand_description = brand_description;
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
        return "BrandDomain{" +
                "brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", phone='" + phone + '\'' +
                ", brand_web='" + brand_web + '\'' +
                ", brand_logo='" + brand_logo + '\'' +
                ", brand_description='" + brand_description + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
