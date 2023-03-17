package com.huawei.test;

import com.huawei.entity.Staging;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        String s = "11..AB..3";
        String[] ss = s.split("");
        System.out.println(ss[0]);
        System.out.println(ss[1]);
        System.out.println(ss[2]);
        System.out.println(ss[3]);
        System.out.println(ss[4]);
        System.out.println(ss[5]);
    }

    public void test1(){
        ArrayList<Staging> stagings=new ArrayList<>();
        stagings.add(new Staging());
    }
}
