package com.ice.Test;

import sun.misc.BASE64Encoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lucky_ice
 * 版权：****
 * 版本：version 1.0
 */
public class Demo {
    public static void main(String args[]) throws IOException {
        BASE64Encoder encoder = new BASE64Encoder();
        System.out.println("请输入用户名：");
        String username = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(encoder.encode(username.getBytes()));
        System.out.println("请输入密码：");
        String password = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(encoder.encode(password.getBytes()));
    }
}
