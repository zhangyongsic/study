package com.zhangyongsic.study.design.single;

/**
 * @program: study
 * @description: 懒汉模式 ，线程不安全 将整个方法加上锁，太重
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class Singleton3 {

    private static Singleton3 singleton;

    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        if (singleton == null){
            singleton = new Singleton3();
        }
        return singleton;
    }

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(Singleton3.getInstance().hashCode());
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
