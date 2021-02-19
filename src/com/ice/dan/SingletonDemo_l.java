package com.ice.dan;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class SingletonDemo_l {

    //类初始化时，不初始化这个对象（延时加载，真正用是时候再创建）
    private static SingletonDemo_l instance=null;

    private SingletonDemo_l(){}//私有化构造器

    //方法同步，调用效率低。
    public static synchronized SingletonDemo_l getInstance(){
        if (instance==null){
            instance=new SingletonDemo_l();
        }
        return instance;
    }
}
