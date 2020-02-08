package com.yzeng.qf.pojo.model;

public class CommentDomain {
    /**
     * 主键编号
     */
    private Integer order_comment_id;
    /**
     * 用户id
     */
    private Integer user_id;
    /**
     * 订单id
     */
    private Integer order_id;
    /**
     * 供应商id
     */
    private Integer supplier_id;
    /**
     * 是否为设计定制产品: 0否 1是
     */
    private Integer is_custom;
    /**
     * 文字评价
     */
    private String evaluation;
    /**
     * 对产品打星0-5
     */
    private Integer product_evaluation;
    /**
     * 对商家打星
     */
    private Integer supplier_evaluation;
    /**
     * 对物流打星
     */
    private Integer logistics_evaluation;
    /**
     * 对整体服务打星
     */
    private Integer service_evaluation;
    /**
     * 图片1
     */
    private String one_image;
    /**
     * 图片2
     */
    private String two_image;
    /**
     * 图片3
     */
    private String three_image;
    /**
     * 图片4
     */
    private String four_image;
    /**
     * 图片5
     */
    private String five_image;
    /**
     * 视频
     */
    private String video;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 状态: 0无效 1有效
     */
    private Integer status;

    public Integer getOrder_comment_id() {
        return order_comment_id;
    }

    public void setOrder_comment_id(Integer order_comment_id) {
        this.order_comment_id = order_comment_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getIs_custom() {
        return is_custom;
    }

    public void setIs_custom(Integer is_custom) {
        this.is_custom = is_custom;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public Integer getProduct_evaluation() {
        return product_evaluation;
    }

    public void setProduct_evaluation(Integer product_evaluation) {
        this.product_evaluation = product_evaluation;
    }

    public Integer getSupplier_evaluation() {
        return supplier_evaluation;
    }

    public void setSupplier_evaluation(Integer supplier_evaluation) {
        this.supplier_evaluation = supplier_evaluation;
    }

    public Integer getLogistics_evaluation() {
        return logistics_evaluation;
    }

    public void setLogistics_evaluation(Integer logistics_evaluation) {
        this.logistics_evaluation = logistics_evaluation;
    }

    public Integer getService_evaluation() {
        return service_evaluation;
    }

    public void setService_evaluation(Integer service_evaluation) {
        this.service_evaluation = service_evaluation;
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

    public String getFour_image() {
        return four_image;
    }

    public void setFour_image(String four_image) {
        this.four_image = four_image;
    }

    public String getFive_image() {
        return five_image;
    }

    public void setFive_image(String five_image) {
        this.five_image = five_image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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
        return "CommentDomain{" +
                "order_comment_id=" + order_comment_id +
                ", user_id=" + user_id +
                ", order_id=" + order_id +
                ", supplier_id=" + supplier_id +
                ", is_custom=" + is_custom +
                ", evaluation='" + evaluation + '\'' +
                ", product_evaluation=" + product_evaluation +
                ", supplier_evaluation=" + supplier_evaluation +
                ", logistics_evaluation=" + logistics_evaluation +
                ", service_evaluation=" + service_evaluation +
                ", one_image='" + one_image + '\'' +
                ", two_image='" + two_image + '\'' +
                ", three_image='" + three_image + '\'' +
                ", four_image='" + four_image + '\'' +
                ", five_image='" + five_image + '\'' +
                ", video='" + video + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
