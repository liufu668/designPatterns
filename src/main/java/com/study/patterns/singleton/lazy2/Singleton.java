package com.study.patterns.singleton.lazy2;

/**
 * 懒汉式:双重检查锁
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的变量,volatile保证指令是有序的
    private static volatile Singleton instance;

    //对外提供访问方式
    public static Singleton getInstance(){
        //第一次判断,如果instance不为null,不需要抢占锁,直接返回对象
        if(instance==null){
            synchronized (Singleton.class){
                //抢到锁之后再次判断instance是否为null
                //如果线程1抢到锁,但卡住了,还没有创建instance对象,被线程2抢先一步,
                // 这时,如果线程1没有在创建前再次检查,就会出现创建多个对象的结果
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
