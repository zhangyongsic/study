package com.zhangyongsic.study.design.single;

/**
 * @program: study
 * @description: 饿汉模式 线程安全，没有使用的时候浪费内存
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class Singleton1 {
    private Singleton1(){}
    private static Singleton1 single = new Singleton1();
    public static Singleton1 getInstance(){
        return single;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    System.out.println(Singleton2.getInstance().hashCode());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        for (int i=0; i<1000; i++){
            new Thread(runnable).start();
        }
    }
}
