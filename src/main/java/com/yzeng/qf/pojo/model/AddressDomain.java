package com.yzeng.qf.pojo.model;

/**
 * qf_address表实体类
 */
public class AddressDomain {
    /** 主键编号 */
    private Integer address_id;
    /** 外键编号关联User表 */
    private Integer user_id;
    /** 收货人姓名 */
    private String receiver_name;
    /** 收货人电话 */
    private String receiver_phone;
    /** 省份 */
    private String receiver_province;
    /** 市 */
    private String receiver_city;
    /** 区/县 */
    private String receiver_district;
    /** 详细地址 */
    private String receiver_address;
    /** 创建时间 */
    private String create_time;
    /** 状态 */
    private Integer status;

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public String getReceiver_province() {
        return receiver_province;
    }

    public void setReceiver_province(String receiver_province) {
        this.receiver_province = receiver_province;
    }

    public String getReceiver_city() {
        return receiver_city;
    }

    public void setReceiver_city(String receiver_city) {
        this.receiver_city = receiver_city;
    }

    public String getReceiver_district() {
        return receiver_district;
    }

    public void setReceiver_district(String receiver_district) {
        this.receiver_district = receiver_district;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
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
        return "AddressDomain{" +
                "address_id=" + address_id +
                ", user_id=" + user_id +
                ", receiver_name='" + receiver_name + '\'' +
                ", receiver_phone='" + receiver_phone + '\'' +
                ", receiver_province='" + receiver_province + '\'' +
                ", receiver_city='" + receiver_city + '\'' +
                ", receiver_district='" + receiver_district + '\'' +
                ", receiver_address='" + receiver_address + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
