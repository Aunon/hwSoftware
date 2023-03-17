package com.huawei.codecraft;

import com.huawei.entity.Robot;
import com.huawei.entity.Staging;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {


    private static final Scanner inStream = new Scanner(System.in);

    private static final PrintStream outStream = new PrintStream(new BufferedOutputStream(System.out));

    public static ArrayList<Staging> stagings;
    public static ArrayList<Robot> robots;

    public static int money;
    public static int stagingNum;
    public static int time;




    public static void main(String[] args) {
        schedule();
    }





    private static void schedule() {
        readUtilOK();
        outStream.println("OK");
        outStream.flush();

        int frameID;
        while (inStream.hasNextLine()) {
            String line = inStream.nextLine();
            String[] parts = line.split(" ");
            frameID = Integer.parseInt(parts[0]);
            readUtilOK();

            outStream.printf("%d\n", frameID);
            int lineSpeed = 3;
            double angleSpeed = 1.5;
            //机器人行动
            for (int robotId = 0; robotId < 4; robotId++) {
                outStream.printf("forward %d %d\n", robotId, lineSpeed);
                outStream.printf("rotate %d %f\n", robotId, angleSpeed);
            }
            outStream.print("OK\n");
            outStream.flush();
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
            //获取第1行参数，确定时间和初始资金
            if(i==1){
                String[] str = line.split(" ");
                time = Integer.parseInt(str[0]);
                money = Integer.parseInt(str[1]);
            }
            //获取第2行参数,确定工作台数量
            if(i==2){
                stagingNum = Integer.parseInt(line);
            }
            //获取第3-k行参数，创造工作台对象
            if(i<=stagingNum+2){
                String[] str = line.split(" ");
                int type = Integer.parseInt(str[0]);
                Double x = Double.parseDouble(str[1]);
                Double y = Double.parseDouble(str[2]);
                int produceTime=Integer.parseInt(str[3]);
                int material=Integer.parseInt(str[4]);
                int ifProduct=Integer.parseInt(str[5]);
                stagings.add(new Staging(type,x,y,produceTime,material,ifProduct));
            }
            //获取最后四行参数，创造机器人对象
            if(i>stagingNum+2){
                String[] str = line.split(" ");
                int stagingId = Integer.parseInt(str[0]);
                double orientation = Double.parseDouble(str[7]);
                double x = Double.parseDouble(str[8]);
                double y = Double.parseDouble(str[9]);
                robots.add(new Robot(stagingId,0,0,0,0,0,0,orientation,x,y));

            }
            i++;
        }
        return false;
    }

}