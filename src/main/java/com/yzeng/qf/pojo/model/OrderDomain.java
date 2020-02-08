package com.yzeng.qf.pojo.model;

import java.math.BigDecimal;

public class OrderDomain {
    /**
     * 主键编号
     */
    private Integer order_id;
    /**
     * 订单编号
     */
    private String order_no;
    /**
     * 用户id
     */
    private Integer user_id;
    /**
     * 商品id
     */
    private Integer product_id;
    /**
     * 供应商id
     */
    private Integer supplier_id;
    /**
     * 供应商反馈单id
     */
    private Integer feedback_id;
    /**
     * 地址id
     */
    private Integer address_id;
    /**
     * 是否为设计定制产品: 0否 1是
     */
    private Integer is_custom;
    /**
     * 支付方式: 1支付宝 2微信 3银行卡
     */
    private Integer payment_type;
    /**
     * 实际付款 总额 元
     */
    private BigDecimal payment;
    /**
     * 七天无理由退货
     */
    private Integer is_return;
    /**
     * 补充说明
     */
    private String supplement;
    /**
     * 支付时间
     */
    private String payment_time;
    /**
     * 交易完成时间
     */
    private String end_time;
    /**
     * 交易关闭时间
     */
    private String close_time;
    /**
     * 更新时间
     */
    private String update_time;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 订单状态: 0已取消 10未付款 20已付款 30已发货 40已收货 50在退货 60退货成功 70交易完成 80交易关闭
     */
    private Integer status;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
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

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(Integer feedback_id) {
        this.feedback_id = feedback_id;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Integer getIs_custom() {
        return is_custom;
    }

    public void setIs_custom(Integer is_custom) {
        this.is_custom = is_custom;
    }

    public Integer getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(Integer payment_type) {
        this.payment_type = payment_type;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Integer getIs_return() {
        return is_return;
    }

    public void setIs_return(Integer is_return) {
        this.is_return = is_return;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public String getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(String payment_time) {
        this.payment_time = payment_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getClose_time() {
        return close_time;
    }

    public void setClose_time(String close_time) {
        this.close_time = close_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
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
        return "OrderDomain{" +
                "order_id=" + order_id +
                ", order_no='" + order_no + '\'' +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", supplier_id=" + supplier_id +
                ", feedback_id=" + feedback_id +
                ", address_id=" + address_id +
                ", is_custom=" + is_custom +
                ", payment_type=" + payment_type +
                ", payment=" + payment +
                ", is_return=" + is_return +
                ", supplement='" + supplement + '\'' +
                ", payment_time='" + payment_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", close_time='" + close_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
