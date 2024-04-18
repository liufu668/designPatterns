package com.study.patterns.singleton.hungry1;

/**
 * 测试:判断创建的多个Singleton类对象是否为同一个对象
 */
public class Client {
    public static void main(String[] args) {

        //创建Singleton类的对象
        Singleton instance=Singleton.getInstance();

        Singleton instance1=Singleton.getInstance();

        System.out.println(instance==instance1);//true
    }
}
