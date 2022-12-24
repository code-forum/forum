package com.forum.web;

public class Singleton {
    private volatile static Singleton singleton;  //1:volatile修饰
    private Singleton (){}  
    public static Singleton getSingleton() {  
    if (singleton == null) {  //2:减少不要同步，优化性能
        synchronized (Singleton.class) {  // 3：同步，线程安全
        if (singleton == null) {  
            singleton = new Singleton();  //4：创建singleton 对象
        }  
        }  
    }  
    return singleton;  
    }

    public String getS(){
        return "aa";
    }
}