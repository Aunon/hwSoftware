package com.huawei.entity;

public class Robot {
    private int stagingId;
    private int type;
    private double fTime;
    private double fCrush;
    private double angleSpeed;
    private Double[] lineSpeed=new Double[2];
    private Double[] coordinate=new Double[2];


    public Robot() {
    }

    public Robot(int stagingId, int type, double fTime, double fCrush, double angleSpeed, Double[] lineSpeed, Double[] coordinate) {
        this.stagingId = stagingId;
        this.type = type;
        this.fTime = fTime;
        this.fCrush = fCrush;
        this.angleSpeed = angleSpeed;
        this.lineSpeed = lineSpeed;
        this.coordinate = coordinate;
    }

    /**
     * 获取
     * @return stagingId
     */
    public int getStagingId() {
        return stagingId;
    }

    /**
     * 设置
     * @param stagingId
     */
    public void setStagingId(int stagingId) {
        this.stagingId = stagingId;
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
     * @return fTime
     */
    public double getFTime() {
        return fTime;
    }

    /**
     * 设置
     * @param fTime
     */
    public void setFTime(double fTime) {
        this.fTime = fTime;
    }

    /**
     * 获取
     * @return fCrush
     */
    public double getFCrush() {
        return fCrush;
    }

    /**
     * 设置
     * @param fCrush
     */
    public void setFCrush(double fCrush) {
        this.fCrush = fCrush;
    }

    /**
     * 获取
     * @return angleSpeed
     */
    public double getAngleSpeed() {
        return angleSpeed;
    }

    /**
     * 设置
     * @param angleSpeed
     */
    public void setAngleSpeed(double angleSpeed) {
        this.angleSpeed = angleSpeed;
    }

    /**
     * 获取
     * @return lineSpeed
     */
    public Double[] getLineSpeed() {
        return lineSpeed;
    }

    /**
     * 设置
     * @param lineSpeed
     */
    public void setLineSpeed(Double[] lineSpeed) {
        this.lineSpeed = lineSpeed;
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

    public String toString() {
        return "robot{stagingId = " + stagingId + ", type = " + type + ", fTime = " + fTime + ", fCrush = " + fCrush + ", angleSpeed = " + angleSpeed + ", lineSpeed = " + lineSpeed + ", coordinate = " + coordinate + "}";
    }
}
