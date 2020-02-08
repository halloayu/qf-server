package com.yzeng.qf.pojo.model;

import java.math.BigDecimal;

public class FeedbackDomain {
    /**
     * 主键编号
     */
    private Integer feedback_id;
    /**
     * 用户id
     */
    private Integer user_id;
    /**
     * 接单供应商id
     */
    private Integer supplier_id;
    /**
     * 任务单id
     */
    private Integer task_id;
    /**
     * 用户选择定制方式 123
     */
    private Integer choose;
    /**
     * 定制金额 第一种 速度快但额度大
     */
    private BigDecimal one_amount;
    /**
     * 交付日期 时间最快
     */
    private String one_delivery;
    /**
     * 定制金额 中等
     */
    private BigDecimal two_amount;
    /**
     * 交付日期
     */
    private String two_delivery;
    /**
     * 定制金额 低等
     */
    private BigDecimal three_amount;
    /**
     * 交付日期
     */
    private String three_delivery;
    /**
     * 运费 元
     */
    private Integer postage;
    /**
     * 七天无理由退货
     */
    private Integer is_return;
    /**
     * 补充说明
     */
    private String supplement;
    /**
     * 附上的图片1
     */
    private String one_image;
    /**
     * 附上的图片2
     */
    private String two_image;
    /**
     * 附上的图片3
     */
    private String three_image;
    /**
     * 更新时间
     */
    private String update_time;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 反馈单状态: 0已取消 1已生效 2待生效 3已过期
     */
    private Integer status;

    public Integer getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(Integer feedback_id) {
        this.feedback_id = feedback_id;
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

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getChoose() {
        return choose;
    }

    public void setChoose(Integer choose) {
        this.choose = choose;
    }

    public BigDecimal getOne_amount() {
        return one_amount;
    }

    public void setOne_amount(BigDecimal one_amount) {
        this.one_amount = one_amount;
    }

    public String getOne_delivery() {
        return one_delivery;
    }

    public void setOne_delivery(String one_delivery) {
        this.one_delivery = one_delivery;
    }

    public BigDecimal getTwo_amount() {
        return two_amount;
    }

    public void setTwo_amount(BigDecimal two_amount) {
        this.two_amount = two_amount;
    }

    public String getTwo_delivery() {
        return two_delivery;
    }

    public void setTwo_delivery(String two_delivery) {
        this.two_delivery = two_delivery;
    }

    public BigDecimal getThree_amount() {
        return three_amount;
    }

    public void setThree_amount(BigDecimal three_amount) {
        this.three_amount = three_amount;
    }

    public String getThree_delivery() {
        return three_delivery;
    }

    public void setThree_delivery(String three_delivery) {
        this.three_delivery = three_delivery;
    }

    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
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

    public String getOne_image() {
        return one_image;
    }

    public void setOne_image(String one_image) {
        this.one_image = one_image;
    }

    public String getTwo_image() {
        return two_image;
    }

    public void setTwo_image(String two_image) {
        this.two_image = two_image;
    }

    public String getThree_image() {
        return three_image;
    }

    public void setThree_image(String three_image) {
        this.three_image = three_image;
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
        return "FeedbackDomain{" +
                "feedback_id=" + feedback_id +
                ", user_id=" + user_id +
                ", supplier_id=" + supplier_id +
                ", task_id=" + task_id +
                ", choose=" + choose +
                ", one_amount=" + one_amount +
                ", one_delivery='" + one_delivery + '\'' +
                ", two_amount=" + two_amount +
                ", two_delivery='" + two_delivery + '\'' +
                ", three_amount=" + three_amount +
                ", three_delivery='" + three_delivery + '\'' +
                ", postage=" + postage +
                ", is_return=" + is_return +
                ", supplement='" + supplement + '\'' +
                ", one_image='" + one_image + '\'' +
                ", two_image='" + two_image + '\'' +
                ", three_image='" + three_image + '\'' +
                ", update_time='" + update_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
