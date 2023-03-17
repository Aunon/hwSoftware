package com.huawei.entity;

public class Staging {
    private int type;
    private Double[] coordinate=new Double[2];
    private int produceTime;
    private int material;
    private int product;

    public Staging() {
    }

    public Staging(int type) {
        this.type = type;
    }

    public Staging(int type, Double[] coordinate, int produceTime, int material, int product) {
        this.type = type;
        this.coordinate = coordinate;
        this.produceTime = produceTime;
        this.material = material;
        this.product = product;
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
     * @return coordinate
     */
    public Double[] getCoordinate() {
        return coordinate;
    }

    /**
     * 设置
     * @param coordinate
     */
    public void setCoordinate(Double[] coordinate) {
        this.coordinate = coordinate;
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
     * @return product
     */
    public int getProduct() {
        return product;
    }

    /**
     * 设置
     * @param product
     */
    public void setProduct(int product) {
        this.product = product;
    }

    public String toString() {
        return "staging{type = " + type + ", coordinate = " + coordinate + ", produceTime = " + produceTime + ", material = " + material + ", product = " + product + "}";
    }
}
