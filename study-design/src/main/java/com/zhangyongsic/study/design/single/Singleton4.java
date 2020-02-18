package com.zhangyongsic.study.design.single;

/**
 * @program: study
 * @description: 懒汉模式 ，线程不安全 将代码块加上锁
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class Singleton4 {

    private static Singleton4 singleton;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if (singleton == null){
            //当几个程序都执行到此处，都重新创建
            synchronized (Singleton4.class){
                singleton = new Singleton4();
            }
        }
        return singleton;
    }

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(Singleton4.getInstance().hashCode());
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
