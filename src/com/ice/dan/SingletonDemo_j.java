package com.ice.dan;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */

/**
 * 测试静态内部类实现单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载
 */
public class SingletonDemo_j {
    private static class SingletonClassInstance {
        private static final SingletonDemo_j instance = new SingletonDemo_j();
    }

    private SingletonDemo_j() {
    }

    //方法没有同步，调用效率高
    public static SingletonDemo_j getInstance() {
        return SingletonClassInstance.instance;
    }
}
