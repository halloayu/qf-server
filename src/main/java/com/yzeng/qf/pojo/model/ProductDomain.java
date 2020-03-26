package com.yzeng.qf.pojo.model;

import java.math.BigDecimal;

public class ProductDomain {
    /**
     * 主键编号
     */
    private Integer product_id;
    /**
     * 商品编码
     */
    private String product_code;
    /**
     * 商品名称
     */
    private String product_name;
    /**
     * 商品描述
     */
    private String product_description;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 邮费
     */
    private BigDecimal postage;
    /**
     * 七天无理由退货
     */
    private Integer is_return;
    /**
     * 品牌id
     */
    private Integer brand_id;
    /**
     * 供应商id
     */
    private Integer supplier_id;
    /**
     * 一级分类:1男装 2女装 3中性
     */
    private Integer one_category;
    /**
     * 二级分类:1上衣 2裤子 3鞋子 4帽子
     */
    private Integer two_category;
    /**
     * 三级分类:具体类别如短裤
     */
    private String three_category;
    /**
     * 主题款式(风格)
     */
    private String main_style;
    /**
     * logo
     */
    private String logo;
    /**
     * 洗水工艺
     */
    private String washing;
    /**
     * 材质
     */
    private String material;
    /**
     * 印花
     */
    private String printing;
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
     * 颜色
     */
    private String color;
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
     * 上市时间
     */
    private String time_to_market;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 数据状态: 0已下架 1上架 2待审核
     */
    private Integer status;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public Integer getIs_return() {
        return is_return;
    }

    public void setIs_return(Integer is_return) {
        this.is_return = is_return;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getOne_category() {
        return one_category;
    }

    public void setOne_category(Integer one_category) {
        this.one_category = one_category;
    }

    public Integer getTwo_category() {
        return two_category;
    }

    public void setTwo_category(Integer two_category) {
        this.two_category = two_category;
    }

    public String getThree_category() {
        return three_category;
    }

    public void setThree_category(String three_category) {
        this.three_category = three_category;
    }

    public String getMain_style() {
        return main_style;
    }

    public void setMain_style(String main_style) {
        this.main_style = main_style;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public String getPrinting() {
        return printing;
    }

    public void setPrinting(String printing) {
        this.printing = printing;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getTime_to_market() {
        return time_to_market;
    }

    public void setTime_to_market(String time_to_market) {
        this.time_to_market = time_to_market;
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
        return "ProductDomain{" +
                "product_id=" + product_id +
                ", product_code=" + product_code +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", price=" + price +
                ", postage=" + postage +
                ", is_return=" + is_return +
                ", brand_id=" + brand_id +
                ", supplier_id=" + supplier_id +
                ", one_category=" + one_category +
                ", two_category=" + two_category +
                ", three_category='" + three_category + '\'' +
                ", main_style='" + main_style + '\'' +
                ", logo='" + logo + '\'' +
                ", washing='" + washing + '\'' +
                ", material='" + material + '\'' +
                ", printing='" + printing + '\'' +
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
                ", color='" + color + '\'' +
                ", filler='" + filler + '\'' +
                ", hem_style='" + hem_style + '\'' +
                ", cuff_style='" + cuff_style + '\'' +
                ", sleeve='" + sleeve + '\'' +
                ", outside_length='" + outside_length + '\'' +
                ", waist_style='" + waist_style + '\'' +
                ", trouser_hem='" + trouser_hem + '\'' +
                ", shell_fabric='" + shell_fabric + '\'' +
                ", time_to_market='" + time_to_market + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
