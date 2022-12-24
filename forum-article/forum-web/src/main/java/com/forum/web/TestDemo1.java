package com.forum.web;

/**
 * @author 李晓龙
 * @version 1.0
 * @description: TODO
 * @date 2022/11/26 22:19
 */
public class TestDemo1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        String s = singleton.getS();
    }
}
