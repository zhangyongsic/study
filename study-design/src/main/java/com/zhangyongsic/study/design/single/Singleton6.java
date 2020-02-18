package com.zhangyongsic.study.design.single;

/**
 * @program: study
 * @description: 懒汉模式 ，线程不安全，将代码块加上锁，
 * 但是发生指令重排时也会出现问题
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class Singleton6 {

    /**
     *  加上 volatile 防止指令重排 ，以及对所有线程可见
     */
    private static volatile Singleton6 singleton;

    private Singleton6(){}

    public static Singleton6 getInstance(){
        if (singleton == null){
            //当几个程序都执行到此处，都重新创建
            synchronized (Singleton6.class){
                //此处再次判断下 保证只创建一个
                if (singleton == null){
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(Singleton6.getInstance().hashCode());
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
