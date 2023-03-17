package com.huawei.codecraft;

import com.huawei.entity.Robot;
import com.huawei.entity.Staging;

import java.io.BufferedOutputStream;
import java.io.PrintStream;
import java.util.Scanner;



public class Main {


    private static final Scanner inStream = new Scanner(System.in);

    private static final PrintStream outStream = new PrintStream(new BufferedOutputStream(System.out));

    private Robot robot1 = new Robot();
    private Robot robot2 = new Robot();
    private Robot robot3 = new Robot();
    private Robot robot4 = new Robot();

    private Staging staging1 = new Staging(1);
    private Staging staging2 = new Staging(2);
    private Staging staging3 = new Staging(3);
    private Staging staging4 = new Staging(4);
    private Staging staging5 = new Staging(5);
    private Staging staging6 = new Staging(6);
    private Staging staging7 = new Staging(7);
    private Staging staging8 = new Staging(8);
    private Staging staging9 = new Staging(9);




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
        while (inStream.hasNextLine()) {
            line = inStream.nextLine();
            if ("OK".equals(line)) {
                return true;
            }
            // do something;
        }
        return false;
    }
}