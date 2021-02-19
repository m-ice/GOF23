package com.ice.dan;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
// 双重检测锁式
public class SingletonDemo_s {
    private static SingletonDemo_s instance = null;

    public static SingletonDemo_s getInstance() {
        if (instance == null) {
            SingletonDemo_s sc;
            synchronized (SingletonDemo_s.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo_s.class) {
                        if (sc == null) {
                            sc = new SingletonDemo_s();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

    private SingletonDemo_s() {
    }
}
