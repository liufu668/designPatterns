package com.study.patterns.singleton.lazy2;

public class Client {
    public static void main(String[] args) {

        //创建Singleton类的对象
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance==instance1);//true
    }
}
