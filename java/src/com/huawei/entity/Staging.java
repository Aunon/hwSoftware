package com.huawei.entity;

public class Staging {
    private int type;
    private Double x;
    private Double y;
    private int produceTime;
    private int material;
    private int ifProduct;

    public Staging() {
    }

    public Staging(int type, Double x, Double y, int produceTime, int material, int ifProduct) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.produceTime = produceTime;
        this.material = material;
        this.ifProduct = ifProduct;
    }

    /**
     * 获取
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * 获取
     * @return x
     */
    public Double getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public Double getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(Double y) {
        this.y = y;
    }

    /**
     * 获取
     * @return produceTime
     */
    public int getProduceTime() {
        return produceTime;
    }

    /**
     * 设置
     * @param produceTime
     */
    public void setProduceTime(int produceTime) {
        this.produceTime = produceTime;
    }

    /**
     * 获取
     * @return material
     */
    public int getMaterial() {
        return material;
    }

    /**
     * 设置
     * @param material
     */
    public void setMaterial(int material) {
        this.material = material;
    }

    /**
     * 获取
     * @return ifProduct
     */
    public int getIfProduct() {
        return ifProduct;
    }

    /**
     * 设置
     * @param ifProduct
     */
    public void setIfProduct(int ifProduct) {
        this.ifProduct = ifProduct;
    }

    public String toString() {
        return "Staging{type = " + type + ", x = " + x + ", y = " + y + ", produceTime = " + produceTime + ", material = " + material + ", ifProduct = " + ifProduct + "}";
    }
}
