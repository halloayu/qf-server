package com.yzeng.qf.pojo.model;


/**
 * qf_size表实体类
 */
public class SizeDomain {
    /** 主键编号 */
    private Integer size_id;
    /** 外键编号关联User表 */
    private Integer user_id;
    /** 身高 */
    private Integer height;
    /** 体重 */
    private Integer weight;
    /** 肩宽 */
    private Integer shoulder;
    /** 胸围 */
    private Integer chest;
    /** 腰围 */
    private Integer waist;
    /** 臀围 */
    private Integer hip;
    /** 脚长 */
    private String foot;
    /** 创建时间 */
    private String create_time;
    /** 状态 */
    private Integer status;

    public Integer getSize_id() {
        return size_id;
    }

    public void setSize_id(Integer size_id) {
        this.size_id = size_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getShoulder() {
        return shoulder;
    }

    public void setShoulder(Integer shoulder) {
        this.shoulder = shoulder;
    }

    public Integer getChest() {
        return chest;
    }

    public void setChest(Integer chest) {
        this.chest = chest;
    }

    public Integer getWaist() {
        return waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Integer getHip() {
        return hip;
    }

    public void setHip(Integer hip) {
        this.hip = hip;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
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
}
