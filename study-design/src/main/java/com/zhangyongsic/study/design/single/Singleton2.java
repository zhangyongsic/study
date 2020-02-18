package com.zhangyongsic.study.design.single;

/**
 * @program: study
 * @description: 懒汉模式 ，线程不安全
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class Singleton2 {

    private static Singleton2 singleton;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(Singleton2.getInstance().hashCode());
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
