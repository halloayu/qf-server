package com.yzeng.qf.pojo.model;

public class UserSupplierDomain {
    /**
     * 主键编号
     */
    private Integer user_supplier_id;
    /**
     * 用户id
     */
    private Integer user_id;
    /**
     * 供应商id
     */
    private Integer supplier_id;
    /**
     * 店铺会员: 0非会员 1黄金 2铂金 3钻石
     */
    private Integer member;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 状态: 0无效 1有效
     */
    private Integer status;

    public Integer getUser_supplier_id() {
        return user_supplier_id;
    }

    public void setUser_supplier_id(Integer user_supplier_id) {
        this.user_supplier_id = user_supplier_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
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
        return "UserSupplierDomain{" +
                "user_supplier_id=" + user_supplier_id +
                ", user_id=" + user_id +
                ", supplier_id=" + supplier_id +
                ", member=" + member +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
