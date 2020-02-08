package com.yzeng.qf.pojo.model;

public class CartDomain {
    /**
     * 主键编号
     */
    private Integer cart_id;
    /**
     * 用户id
     */
    private Integer user_id;
    /**
     * 商品id
     */
    private Integer product_id;
    /**
     * 商品数目
     */
    private Integer product_amount;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 状态: 0无效 1有效
     */
    private Integer status;

    public Integer getCart_id() {
        return cart_id;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
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

    public Integer getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(Integer product_amount) {
        this.product_amount = product_amount;
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
        return "CartDomain{" +
                "cart_id=" + cart_id +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", product_amount=" + product_amount +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
