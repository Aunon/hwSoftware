package com.huawei.codecraft;

import com.huawei.entity.Robot;
import com.huawei.entity.Staging;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.Scanner;



public class Main {


    private static final Scanner inStream = new Scanner(System.in);

    private static final PrintStream outStream = new PrintStream(new BufferedOutputStream(System.out));

    public static Staging[] stagings=new Staging[9];
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
            int lineSpeed=3;
            //机器人行动
            for (int robotIndex = 0; robotIndex < 4; robotIndex++) {
                int robotId=robots[robotIndex].getRobotId();
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

                if(type==stagingId){
                    outStream.printf("sell %d",stagingId);
                }

                outStream.printf("forward %d %d\n", robotIndex, lineSpeed);
                outStream.printf("rotate %d %f\n", robotIndex, angleSpeed);
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
                    stagings[0]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('2')){
                    stagings[1]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('3')){
                    stagings[2]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('4')){
                    stagings[3]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('5')){
                    stagings[4]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('6')){
                    stagings[5]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('7')){
                    stagings[6]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('8')){
                    stagings[7]=new Staging(0.25+j*0.5,0.25+i*0.5);
                }
                if(str[j].equals('9')){
                    stagings[8]=new Staging(0.25+j*0.5,0.25+i*0.5);
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

    private void moveToProduct(int robotIndex){
        int robotId=robots[robotIndex].getRobotId();
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
        //去一号工作台拿货
        if(stagings[0].getIfProduct()==1){
            if(x-stagings[0].getX()>0){

            }
        }
    }

    private void turnLeft(int robotIndex){
        if(robots[robotIndex].getOrientation()==1.57080){
            outStream.printf("rotate %d %f\n", robotIndex,2);
        }
    }

}