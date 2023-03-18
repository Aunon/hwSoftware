package com.huawei.codecraft;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class Robot {
    private int robotId;
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
    private int needStatic=0;
    private int needRotate=1;




    public Robot(int robotId, double x, double y) {
        this.robotId = robotId;
        this.x = x;
        this.y = y;
    }


    public Robot() {
    }

    public Robot(int robotId, int stagingId, int type, double fTime, double fCrush, double angleSpeed, double xLineSpeed, double yLineSpeed, double orientation, double x, double y, int needStatic, int needRotate) {
        this.robotId = robotId;
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
        this.needStatic = needStatic;
        this.needRotate = needRotate;
    }

    /**
     * 获取
     * @return robotId
     */
    public int getRobotId() {
        return robotId;
    }

    /**
     * 设置
     * @param robotId
     */
    public void setRobotId(int robotId) {
        this.robotId = robotId;
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

    /**
     * 获取
     * @return needStatic
     */
    public int getNeedStatic() {
        return needStatic;
    }

    /**
     * 设置
     * @param needStatic
     */
    public void setNeedStatic(int needStatic) {
        this.needStatic = needStatic;
    }

    /**
     * 获取
     * @return needRotate
     */
    public int getNeedRotate() {
        return needRotate;
    }

    /**
     * 设置
     * @param needRotate
     */
    public void setNeedRotate(int needRotate) {
        this.needRotate = needRotate;
    }

    public String toString() {
        return "Robot{robotId = " + robotId + ", stagingId = " + stagingId + ", type = " + type + ", fTime = " + fTime + ", fCrush = " + fCrush + ", angleSpeed = " + angleSpeed + ", xLineSpeed = " + xLineSpeed + ", yLineSpeed = " + yLineSpeed + ", orientation = " + orientation + ", x = " + x + ", y = " + y + ", needStatic = " + needStatic + ", needRotate = " + needRotate + "}";
    }
}

class staging {
    private int type;
    private Double x;
    private Double y;
    private int produceTime;
    private int material;
    private int ifProduct;

    public staging() {
    }

    public staging(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public staging(int type, Double x, Double y, int produceTime, int material, int ifProduct) {
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

public class Main {


    private static final Scanner inStream = new Scanner(System.in);

    private static final PrintStream outStream = new PrintStream(new BufferedOutputStream(System.out));

    public static staging[] stagings=new staging[9];
    public static Robot[] robots=new Robot[4];

    public static int money;
    public static int stagingNum;
    public static int frameID;

    public static void main(String[] args) {
        schedule();
    }


    private static void schedule() {
        init();
        outStream.println("OK");
        outStream.flush();

        while (inStream.hasNextLine()) {

            readUtilOK();
            outStream.printf("%d\n", frameID);
            //机器人行动
            for (int robotIndex = 0; robotIndex < 4; robotIndex++) {
                /*int robotId=robots[robotIndex].getRobotId();
                int stagingId=robots[robotIndex].getStagingId();
                int type=robots[robotIndex].getType();
                double fTime=robots[robotIndex].getFTime();
                double fCrush=robots[robotIndex].getFCrush();
                double angleSpeed=robots[robotIndex].getAngleSpeed();
                double xLineSpeed=robots[robotIndex].getXLineSpeed();
                double yLineSpeed=robots[robotIndex].getYLineSpeed();
                double orientation=robots[robotIndex].getOrientation();
                double x=robots[robotIndex].getX();
                double y=robots[robotIndex].getY();
*/
                if(robots[robotIndex].getType()==0){
                    toBuy(robotIndex);
                }
                if(robots[robotIndex].getType()!=0){
                    toSell(robotIndex);
                }
            }
            outStream.print("OK\n");
            outStream.flush();
        }
    }

    private static void init(){
        int robotIndex = 0;
        String line;
        for(int i =100;i>0;i--){
            line=inStream.nextLine();
            String[] str = line.split("");
            for (int j = 1; i <101; i++) {
                //初始化机器人
                if(str[j].equals('A')){
                    robots[robotIndex]=new Robot(robotIndex,0.25+j*0.5,0.25+i*0.5);
                    robotIndex++;
                }
                //初始化工作台
                if(str[j].equals('1')){
                    stagings[0]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('2')){
                    stagings[1]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('3')){
                    stagings[2]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('4')){
                    stagings[3]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('5')){
                    stagings[4]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('6')){
                    stagings[5]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('7')){
                    stagings[6]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('8')){
                    stagings[7]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('9')){
                    stagings[8]=new staging(0.25+j*0.5,0.25+i*0.5);
                }
            }
        }
    }

    private static boolean readUtilOK() {
        String line;
        int i = 1;
        while (inStream.hasNextLine()) {
            int stagingIndex=0;
            int robotIndex=0;
            line = inStream.nextLine();
            if ("OK".equals(line)) {
                return true;
            }
            // do something;
            //获取第1行参数，确定时间和资金
            if(i==1){
                String[] str = line.split(" ");
                frameID = Integer.parseInt(str[0]);
                money = Integer.parseInt(str[1]);
            }
            //获取第2行参数,确定工作台数量
            if(i==2){
                stagingNum = Integer.parseInt(line);
            }
            //获取第3-k行参数
            if(i==3){
                for(int j=0;j<9;j++){
                    String[] str = line.split(" ");
                    stagings[stagingIndex].setType(Integer.parseInt(str[0]));
                    stagings[stagingIndex].setX(Double.parseDouble(str[1]));
                    stagings[stagingIndex].setY(Double.parseDouble(str[2]));
                    stagings[stagingIndex].setProduceTime(Integer.parseInt(str[3]));
                    stagings[stagingIndex].setMaterial(Integer.parseInt(str[4]));
                    stagings[stagingIndex].setIfProduct(Integer.parseInt(str[5]));
                    line=inStream.nextLine();
                    stagingIndex++;
                }
                i+=9;
            }
            //获取最后四行参数
            if(i==11){
                for(int j=0;j<4;j++){
                    String[] str = line.split(" ");
                    robots[robotIndex].setStagingId(Integer.parseInt(str[0]));
                    robots[robotIndex].setType(Integer.parseInt(str[1]));
                    robots[robotIndex].setFTime(Double.parseDouble(str[2]));
                    robots[robotIndex].setFCrush(Double.parseDouble(str[3]));
                    robots[robotIndex].setAngleSpeed(Double.parseDouble(str[4]));
                    robots[robotIndex].setXLineSpeed(Double.parseDouble(str[5]));
                    robots[robotIndex].setYLineSpeed(Double.parseDouble(str[6]));
                    robots[robotIndex].setOrientation(Double.parseDouble(str[7]));
                    robots[robotIndex].setX(Double.parseDouble(str[8]));
                    robots[robotIndex].setY(Double.parseDouble(str[9]));
                    line=inStream.nextLine();
                    robotIndex++;
                }
                i+=9;
            }
            i++;
        }
        return false;
    }

    private static void toBuy(int robotIndex){
        //去一号工作台拿货
        if(stagings[0].getIfProduct()==1){
            changeDeriction(robotIndex,0);
            rush(robotIndex,0);
            buy(robotIndex,0);
            return;
        }
        if(stagings[1].getIfProduct()==1){
            changeDeriction(robotIndex,1);
            rush(robotIndex,1);
            buy(robotIndex,1);
            return;
        }
        if(stagings[2].getIfProduct()==1){
            changeDeriction(robotIndex,2);
            rush(robotIndex,2);
            buy(robotIndex,2);
            return;
        }
    }
    private static void toSell(int robotIndex){
        //去四号工作台卖
        if(robots[robotIndex].getType()==1&&stagings[3].getMaterial()==1){
            changeDeriction(robotIndex,3);
            rush(robotIndex,3);
            sell(robotIndex,3);
            return;
        }
        if(robots[robotIndex].getType()==2&&stagings[3].getMaterial()==1){
            changeDeriction(robotIndex,3);
            rush(robotIndex,3);
            sell(robotIndex,3);
            return;
        }
        //5
        if(robots[robotIndex].getType()==1&&stagings[4].getMaterial()==1){
            changeDeriction(robotIndex,4);
            rush(robotIndex,4);
            sell(robotIndex,4);
            return;
        }
        if(robots[robotIndex].getType()==3&&stagings[4].getMaterial()==1){
            changeDeriction(robotIndex,4);
            rush(robotIndex,4);
            sell(robotIndex,4);
            return;
        }
        //6
        if(robots[robotIndex].getType()==2&&stagings[5].getMaterial()==1){
            changeDeriction(robotIndex,5);
            rush(robotIndex,5);
            sell(robotIndex,5);
            return;
        }
        if(robots[robotIndex].getType()==3&&stagings[5].getMaterial()==1){
            changeDeriction(robotIndex,5);
            rush(robotIndex,5);
            sell(robotIndex,5);
            return;
        }
    }

    private static void changeDeriction(int robotIndex,int stagingIndex){
        if(robots[robotIndex].getNeedRotate()==0){
            return;
        }
        Double c=Math.pow((Math.sqrt(robots[robotIndex].getX()-stagings[stagingIndex].getX()))+(Math.sqrt(robots[robotIndex].getY()-stagings[stagingIndex].getY())),0.5);
        Double a=Math.abs(robots[robotIndex].getX()-stagings[stagingIndex].getX());
        Double b=Math.abs(robots[robotIndex].getY()-stagings[stagingIndex].getY());
        Double angel;
        angel=Math.toRadians(Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b))));
        if(angel>0.008){
            outStream.printf("rotate %d %f\n", robotIndex,Math.PI);
        }else if(angel<=0.008 && robots[robotIndex].getAngleSpeed()>0.01){
            outStream.printf("rotate %d %f\n", robotIndex,0);
        } else{
            robots[robotIndex].setNeedRotate(0);
        }
        //if(robots[robotIndex].getOrientation()-)
    }

    private static void toStatic(int robotIndex,int stagingIndex){
        Double c=Math.pow((Math.sqrt(robots[robotIndex].getX()-stagings[stagingIndex].getX()))+(Math.sqrt(robots[robotIndex].getY()-stagings[stagingIndex].getY())),0.5);
        if(robots[robotIndex].getNeedStatic()==0){
            return;
        }
        if(Math.abs(robots[robotIndex].getXLineSpeed())>0.0001 || Math.abs(robots[robotIndex].getYLineSpeed())>0.0001){
            outStream.printf("forward %d %d\n", robotIndex, -2);
        }else if(Math.abs(robots[robotIndex].getXLineSpeed())>0.0001 &&Math.abs(robots[robotIndex].getYLineSpeed())>0.0001&&c<0.01){
            outStream.printf("forward %d %d\n", robotIndex, 0);
        } else{
            outStream.printf("forward %d %d\n", robotIndex, 0);
            robots[robotIndex].setNeedStatic(0);
        }
    }

    private static void rush(int robotIndex,int stagingIndex){
        Double c=Math.pow((Math.sqrt(robots[robotIndex].getX()-stagings[stagingIndex].getX()))+(Math.sqrt(robots[robotIndex].getY()-stagings[stagingIndex].getY())),0.5);

        if(c>0.4){
            outStream.printf("forward %d %d\n",robotIndex,6);
        }
    }
    private static void sell(int robotIndex,int stagingIndex){
        Double c=Math.pow((Math.sqrt(robots[robotIndex].getX()-stagings[stagingIndex].getX()))+(Math.sqrt(robots[robotIndex].getY()-stagings[stagingIndex].getY())),0.5);

        if(c<=0.4){
            outStream.printf("sell %d\n",stagingIndex);
            robots[robotIndex].setNeedRotate(1);
            robots[robotIndex].setNeedStatic(1);
        }
    }
    private static void buy(int robotIndex,int stagingIndex){
        Double c=Math.pow((Math.sqrt(robots[robotIndex].getX()-stagings[stagingIndex].getX()))+(Math.sqrt(robots[robotIndex].getY()-stagings[stagingIndex].getY())),0.5);

        if(c<=0.4){
            outStream.printf("buy %d\n",stagingIndex);
            robots[robotIndex].setNeedStatic(1);
            robots[robotIndex].setNeedRotate(1);
        }
    }



}