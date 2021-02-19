package com.ice.dan;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Client{
    public static void main(String[] args) {
        SingletonDemo_m s1=SingletonDemo_m.INSTANCE;
        SingletonDemo_m s2=SingletonDemo_m.INSTANCE;
        System.out.println(s1==s2);//输出结果为：true 表示s1与s2是同一个对象
    }
}
