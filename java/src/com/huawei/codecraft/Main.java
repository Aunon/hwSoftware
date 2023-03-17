package com.huawei.codecraft;

import com.huawei.entity.Robot;
import com.huawei.entity.Staging;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class Main {


    private static final Scanner inStream = new Scanner(System.in);

    private static final PrintStream outStream = new PrintStream(new BufferedOutputStream(System.out));

    public static ArrayList<Staging> stagings;
    public static ArrayList<Robot> robots;

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
            int lineSpeed = 3;
            double angleSpeed = 1.5;
            //机器人行动
            for (int robotId = 0; robotId < 4; robotId++) {
                //设置速度
                outStream.printf("forward %d %d\n", robotId, lineSpeed);
                outStream.printf("rotate %d %f\n", robotId, angleSpeed);
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
                    robots.add(new Robot(robotIndex,0.25+j*0.5,0.25+i*0.5));
                    robotIndex++;
                }
                //初始化工作台
                if(str[j].equals('1')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('2')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('3')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('4')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('5')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('6')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('7')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('8')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
                if(str[j].equals('9')){
                    stagings.add(new Staging(0.25+j*0.5,0.25+i*0.5));
                }
            }
        }
    }

    private static boolean readUtilOK() {
        String line;
        int i = 1;
        while (inStream.hasNextLine()) {
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
                    Staging staging = stagings.get(j);
                    staging.setType(Integer.parseInt(str[0]));
                    staging.setX(Double.parseDouble(str[1]));
                    staging.setY(Double.parseDouble(str[2]));
                    staging.setProduceTime(Integer.parseInt(str[3]));
                    staging.setMaterial(Integer.parseInt(str[4]));
                    staging.setIfProduct(Integer.parseInt(str[5]));
                    line=inStream.nextLine();
                }
                i+=9;
            }
            //获取最后四行参数
            if(i==11){
                for(int j=0;j<4;j++){
                    String[] str = line.split(" ");
                    Robot robot = robots.get(j);
                    robot.setStagingId(Integer.parseInt(str[0]));
                    robot.setType(Integer.parseInt(str[1]));
                    robot.setFTime(Double.parseDouble(str[2]));
                    robot.setFCrush(Double.parseDouble(str[3]));
                    robot.setAngleSpeed(Double.parseDouble(str[4]));
                    robot.setXLineSpeed(Double.parseDouble(str[5]));
                    robot.setYLineSpeed(Double.parseDouble(str[6]));
                    robot.setOrientation(Double.parseDouble(str[7]));
                    robot.setX(Double.parseDouble(str[8]));
                    robot.setY(Double.parseDouble(str[9]));
                    line=inStream.nextLine();
                }
                i+=9;
            }
            i++;
        }
        return false;
    }

}