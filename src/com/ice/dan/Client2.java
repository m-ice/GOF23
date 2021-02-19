package com.ice.dan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式
 *
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
        SingletonTest_l s1 = SingletonTest_l.getInstance();
        SingletonTest_l s2 = SingletonTest_l.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        //通过反射的方式直接调用私有构造器
        /*Class<SingletonTest_l> clazz = (Class<SingletonTest_l>) Class.forName("com.ice.dan.SingletonTest_l");
        Constructor<SingletonTest_l> c = clazz.getDeclaredConstructor(null);

        c.setAccessible(true);

        SingletonTest_l s3 = c.newInstance();
        SingletonTest_l s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);*/

        //通过反序列化的方式构造多个对象
        FileOutputStream fos = new FileOutputStream("D:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        SingletonTest_l s3 = (SingletonTest_l) ois.readObject();
        System.out.println(s3);

    }
}
