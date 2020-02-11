package com.yzeng.qf.pojo.model;

public class SupplierDomain {
    /**
     * 主键编号
     */
    private Integer supplier_id;
    /**
     * 供应商编码
     */
    private String supplier_code;
    /**
     * 供应商名字
     */
    private String supplier_name;
    /**
     * 供应商类型: 1自营 2平台
     */
    private Integer supplier_type;
    /**
     * 联系人
     */
    private String supplier_contact;
    /**
     * 联系电话
     */
    private String supplier_phone;
    /**
     * 开户银行名称
     */
    private String bank_name;
    /**
     * 银行账户
     */
    private String bank_account;
    /**
     * 地址
     */
    private String supplier_address;
    /**
     * 评价 总分为5
     */
    private Integer supplier_evaluation;
    /**
     * 月销量 笔
     */
    private Integer month_sale;
    /**
     * 创建时间
     */
    private String create_time;
    /**
     * 数据状态: 0无效店铺 1已开发服务 2未开发服务 3待审核 4拉黑
     */
    private Integer status;

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public Integer getSupplier_type() {
        return supplier_type;
    }

    public void setSupplier_type(Integer supplier_type) {
        this.supplier_type = supplier_type;
    }

    public String getSupplier_contact() {
        return supplier_contact;
    }

    public void setSupplier_contact(String supplier_contact) {
        this.supplier_contact = supplier_contact;
    }

    public String getSupplier_phone() {
        return supplier_phone;
    }

    public void setSupplier_phone(String supplier_phone) {
        this.supplier_phone = supplier_phone;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    public Integer getSupplier_evaluation() {
        return supplier_evaluation;
    }

    public void setSupplier_evaluation(Integer supplier_evaluation) {
        this.supplier_evaluation = supplier_evaluation;
    }

    public Integer getMonth_sale() {
        return month_sale;
    }

    public void setMonth_sale(Integer month_sale) {
        this.month_sale = month_sale;
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
        return "SupplierDomain{" +
                "supplier_id=" + supplier_id +
                ", supplier_code='" + supplier_code + '\'' +
                ", supplier_name='" + supplier_name + '\'' +
                ", supplier_type=" + supplier_type +
                ", supplier_contact='" + supplier_contact + '\'' +
                ", supplier_phone='" + supplier_phone + '\'' +
                ", bank_name='" + bank_name + '\'' +
                ", bank_account='" + bank_account + '\'' +
                ", supplier_address='" + supplier_address + '\'' +
                ", supplier_evaluation=" + supplier_evaluation +
                ", month_sale=" + month_sale +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                '}';
    }
}
