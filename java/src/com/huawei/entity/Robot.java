package com.huawei.entity;

public class Robot {
    private int stagingId;
    private int type;
    private double fTime;
    private double fCrush;
    private double angleSpeed;
    private double xLineSpeed;
    private double yLineSpeed;
    private double orientation;
    private double x;
    private double y;


    public Robot() {
    }

    public Robot(int stagingId, int type, double fTime, double fCrush, double angleSpeed, double xLineSpeed, double yLineSpeed, double orientation, double x, double y) {
        this.stagingId = stagingId;
        this.type = type;
        this.fTime = fTime;
        this.fCrush = fCrush;
        this.angleSpeed = angleSpeed;
        this.xLineSpeed = xLineSpeed;
        this.yLineSpeed = yLineSpeed;
        this.orientation = orientation;
        this.x = x;
        this.y = y;
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
     * @return xLineSpeed
     */
    public double getXLineSpeed() {
        return xLineSpeed;
    }

    /**
     * 设置
     * @param xLineSpeed
     */
    public void setXLineSpeed(double xLineSpeed) {
        this.xLineSpeed = xLineSpeed;
    }

    /**
     * 获取
     * @return yLineSpeed
     */
    public double getYLineSpeed() {
        return yLineSpeed;
    }

    /**
     * 设置
     * @param yLineSpeed
     */
    public void setYLineSpeed(double yLineSpeed) {
        this.yLineSpeed = yLineSpeed;
    }

    /**
     * 获取
     * @return orientation
     */
    public double getOrientation() {
        return orientation;
    }

    /**
     * 设置
     * @param orientation
     */
    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    /**
     * 获取
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Robot{stagingId = " + stagingId + ", type = " + type + ", fTime = " + fTime + ", fCrush = " + fCrush + ", angleSpeed = " + angleSpeed + ", xLineSpeed = " + xLineSpeed + ", yLineSpeed = " + yLineSpeed + ", orientation = " + orientation + ", x = " + x + ", y = " + y + "}";
    }
}
