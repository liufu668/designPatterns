package com.study.patterns.singleton.lazy1;

/**
 * 懒汉式
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的变量instance,并没有进行赋值
    private static Singleton instance;

    //对外提供访问方式,加synchronized锁是防止线程1卡住时,被线程2抢先进if创建了,导致最后出现多个instance对象
    public static synchronized Singleton getInstance(){
        //如果还没创建instance,就创建一个;
        // 如果已经创建,就用它;
        // 保证Singleton只有一个对象实例
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
