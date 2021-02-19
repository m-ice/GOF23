package com.ice.dan;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class SingletonDemo_e {

    //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的
    private static SingletonDemo_e instance = new SingletonDemo_e();

    private SingletonDemo_e() {
    }//私有化构造器

    //方法没有同步，调用效率高
    public static SingletonDemo_e getInstance() {
        return instance;
    }
}
