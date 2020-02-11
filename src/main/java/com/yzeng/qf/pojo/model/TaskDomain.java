package com.yzeng.qf.pojo.model;

import java.math.BigDecimal;

public class TaskDomain {
    /**
     * 主键编号
     */
    private Integer task_id;
    /**
     * 用户id
     */
    private Integer user_id;
    /**
     * 模型id
     */
    private Integer model_id;
    /**
     * 供应商id 0平台
     */
    private Integer supplier_id;
    /**
     * 尺码id
     */
    private Integer size_id;
    /**
     * 期望的定制金额
     */
    private BigDecimal expect_amount;
    /**
     * 期望的交付期限
     */
    private String delivery;
    /**
     * 任务单评分
     */
    private Integer score;
    /**
     * 补充说明
     */
    private String supplement;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 任务单状态: 0已取消 1已发布 2待发布 3已过期
     */
    private Integer status;

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getModel_id() {
        return model_id;
    }

    public void setModel_id(Integer model_id) {
        this.model_id = model_id;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getSize_id() {
        return size_id;
    }

    public void setSize_id(Integer size_id) {
        this.size_id = size_id;
    }

    public BigDecimal getExpect_amount() {
        return expect_amount;
    }

    public void setExpect_amount(BigDecimal expect_amount) {
        this.expect_amount = expect_amount;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
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
        return "TaskDomain{" +
                "task_id=" + task_id +
                ", user_id=" + user_id +
                ", model_id=" + model_id +
                ", supplier_id=" + supplier_id +
                ", size_id=" + size_id +
                ", expect_amount=" + expect_amount +
                ", delivery='" + delivery + '\'' +
                ", score=" + score +
                ", supplement='" + supplement + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
