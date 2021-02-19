package com.ice.dan;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例（如何防止反射和反序列漏洞）
 *
 * @author lucky_ice
 */
public class SingletonTest_l implements Serializable {
    //类初始化时，不初始化这个对象（延时加载，真正用是时候再创建）
    private static SingletonTest_l instance = null;

    private SingletonTest_l() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }//私有化构造器

    //方法同步，调用效率低。
    public static synchronized SingletonTest_l getInstance() {
        if (instance == null) {
            instance = new SingletonTest_l();
        }
        return instance;
    }

    //反序列化时，如果定义了readResolve（）则直接返回此方法指定的对象，而不需要单独再创建新对象。
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
