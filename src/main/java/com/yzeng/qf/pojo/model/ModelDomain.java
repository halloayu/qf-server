package com.yzeng.qf.pojo.model;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class ModelDomain {
    /**
     * 主键编号
     */
    private Integer model_id;
    /**
     * 模型名称
     */
    private String model_name;
    /**
     * 用户id
     */
    private Integer user_id;
    /**
     * 模型评分 满分100
     */
    private Integer score;
    /**
     * 三级分类
     */
    private String category;
    /**
     * 模型图片正面
     */
    private String image_front;
    /**
     * 模型图片背面
     */
    private String image_back;
    /**
     * 主题款式(风格)
     */
    private String main_style;
    /**
     * 洗水工艺
     */
    private String washing;
    /**
     * 材质
     */
    private String material;
    /**
     * 印花正面 url
     */
    private String printing_front;
    /**
     * 印花背面 url
     */
    private String printing_back;
    /**
     * 厚薄
     */
    private String thickness;
    /**
     * 服饰工艺
     */
    private String clothing_technology;
    /**
     * 领型
     */
    private String collar_type;
    /**
     * 版型
     */
    private String model_type;
    /**
     * 适用对象
     */
    private String suitable;
    /**
     * 适用季节
     */
    private String season;
    /**
     * 尺码
     */
    private String size;
    /**
     * 门襟
     */
    private String placket;
    /**
     * 裤门襟
     */
    private String front_pant;
    /**
     * 口袋样式
     */
    private String pocket;
    /**
     * 颜色正面
     */
    private String color_front;
    /**
     * 颜色背面
     */
    private String color_back;
    /**
     * 左袖子颜色
     */
    private String sleeve_left_color;
    /**
     * 右袖子颜色
     */
    private String sleeve_right_color;
    /**
     * 左裤管颜色
     */
    private String trouser_left_color;
    /**
     * 右裤管颜色
     */
    private String trouser_right_color;
    /**
     * 填充物
     */
    private String filler;
    /**
     * 下摆设计
     */
    private String hem_style;
    /**
     * 袖口设计
     */
    private String cuff_style;
    /**
     * 袖长
     */
    private String sleeve;
    /**
     * 裤长
     */
    private String outside_length;
    /**
     * 腰型
     */
    private String waist_style;
    /**
     * 裤脚口设计
     */
    private String trouser_hem;
    /**
     * 面料
     */
    private String shell_fabric;
    /**
     * 签名
     */
    private String signature;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 数据状态: 0无效 1有效
     */
    private Integer status;

    public Integer getModel_id() {
        return model_id;
    }

    public void setModel_id(Integer model_id) {
        this.model_id = model_id;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage_front() {
        return image_front;
    }

    public void setImage_front(String image_front) {
        this.image_front = image_front;
    }

    public String getImage_back() {
        return image_back;
    }

    public void setImage_back(String image_back) {
        this.image_back = image_back;
    }

    public String getMain_style() {
        return main_style;
    }

    public void setMain_style(String main_style) {
        this.main_style = main_style;
    }

    public String getWashing() {
        return washing;
    }

    public void setWashing(String washing) {
        this.washing = washing;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPrinting_front() {
        return printing_front;
    }

    public void setPrinting_front(String printing_front) {
        this.printing_front = printing_front;
    }

    public String getPrinting_back() {
        return printing_back;
    }

    public void setPrinting_back(String printing_back) {
        this.printing_back = printing_back;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public String getClothing_technology() {
        return clothing_technology;
    }

    public void setClothing_technology(String clothing_technology) {
        this.clothing_technology = clothing_technology;
    }

    public String getCollar_type() {
        return collar_type;
    }

    public void setCollar_type(String collar_type) {
        this.collar_type = collar_type;
    }

    public String getModel_type() {
        return model_type;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public String getSuitable() {
        return suitable;
    }

    public void setSuitable(String suitable) {
        this.suitable = suitable;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPlacket() {
        return placket;
    }

    public void setPlacket(String placket) {
        this.placket = placket;
    }

    public String getFront_pant() {
        return front_pant;
    }

    public void setFront_pant(String front_pant) {
        this.front_pant = front_pant;
    }

    public String getPocket() {
        return pocket;
    }

    public void setPocket(String pocket) {
        this.pocket = pocket;
    }

    public String getColor_front() {
        return color_front;
    }

    public void setColor_front(String color_front) {
        this.color_front = color_front;
    }

    public String getColor_back() {
        return color_back;
    }

    public void setColor_back(String color_back) {
        this.color_back = color_back;
    }

    public String getSleeve_left_color() {
        return sleeve_left_color;
    }

    public void setSleeve_left_color(String sleeve_left_color) {
        this.sleeve_left_color = sleeve_left_color;
    }

    public String getSleeve_right_color() {
        return sleeve_right_color;
    }

    public void setSleeve_right_color(String sleeve_right_color) {
        this.sleeve_right_color = sleeve_right_color;
    }

    public String getTrouser_left_color() {
        return trouser_left_color;
    }

    public void setTrouser_left_color(String trouser_left_color) {
        this.trouser_left_color = trouser_left_color;
    }

    public String getTrouser_right_color() {
        return trouser_right_color;
    }

    public void setTrouser_right_color(String trouser_right_color) {
        this.trouser_right_color = trouser_right_color;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public String getHem_style() {
        return hem_style;
    }

    public void setHem_style(String hem_style) {
        this.hem_style = hem_style;
    }

    public String getCuff_style() {
        return cuff_style;
    }

    public void setCuff_style(String cuff_style) {
        this.cuff_style = cuff_style;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getOutside_length() {
        return outside_length;
    }

    public void setOutside_length(String outside_length) {
        this.outside_length = outside_length;
    }

    public String getWaist_style() {
        return waist_style;
    }

    public void setWaist_style(String waist_style) {
        this.waist_style = waist_style;
    }

    public String getTrouser_hem() {
        return trouser_hem;
    }

    public void setTrouser_hem(String trouser_hem) {
        this.trouser_hem = trouser_hem;
    }

    public String getShell_fabric() {
        return shell_fabric;
    }

    public void setShell_fabric(String shell_fabric) {
        this.shell_fabric = shell_fabric;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
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
        return "ModelDomain{" +
                "model_id=" + model_id +
                ", model_name='" + model_name + '\'' +
                ", user_id=" + user_id +
                ", score=" + score +
                ", category='" + category + '\'' +
                ", image_front='" + image_front + '\'' +
                ", image_back='" + image_back + '\'' +
                ", main_style='" + main_style + '\'' +
                ", washing='" + washing + '\'' +
                ", material='" + material + '\'' +
                ", printing_front='" + printing_front + '\'' +
                ", printing_back='" + printing_back + '\'' +
                ", thickness='" + thickness + '\'' +
                ", clothing_technology='" + clothing_technology + '\'' +
                ", collar_type='" + collar_type + '\'' +
                ", model_type='" + model_type + '\'' +
                ", suitable='" + suitable + '\'' +
                ", season='" + season + '\'' +
                ", size='" + size + '\'' +
                ", placket='" + placket + '\'' +
                ", front_pant='" + front_pant + '\'' +
                ", pocket='" + pocket + '\'' +
                ", color_front='" + color_front + '\'' +
                ", color_back='" + color_back + '\'' +
                ", sleeve_left_color='" + sleeve_left_color + '\'' +
                ", sleeve_right_color='" + sleeve_right_color + '\'' +
                ", trouser_left_color='" + trouser_left_color + '\'' +
                ", trouser_right_color='" + trouser_right_color + '\'' +
                ", filler='" + filler + '\'' +
                ", hem_style='" + hem_style + '\'' +
                ", cuff_style='" + cuff_style + '\'' +
                ", sleeve='" + sleeve + '\'' +
                ", outside_length='" + outside_length + '\'' +
                ", waist_style='" + waist_style + '\'' +
                ", trouser_hem='" + trouser_hem + '\'' +
                ", shell_fabric='" + shell_fabric + '\'' +
                ", signature='" + signature + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
