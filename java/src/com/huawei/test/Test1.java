package com.huawei.test;

import com.huawei.entity.Staging;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        String s = "1144 199346 sss";
        String[] ss = s.split(" ");
        System.out.println(ss[0]);
        System.out.println(ss[1]);
        System.out.println(ss[2]);
        int i1=Integer.parseInt(ss[0])+1;
        int i2=Integer.parseInt(ss[1])-1;
        System.out.println(i1);
        System.out.println(i2);
    }

    public void test1(){
        ArrayList<Staging> stagings=new ArrayList<>();
        stagings.add(new Staging());
    }
}
