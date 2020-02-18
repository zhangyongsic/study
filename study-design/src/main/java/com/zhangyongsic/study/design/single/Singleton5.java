package com.zhangyongsic.study.design.single;

/**
 * @program: study
 * @description: 懒汉模式 ，线程不安全，将代码块加上锁，
 * 但是发生指令重排时也会出现问题
 * 为什么会发生指令重排：当两条语句没有任何联系是，将可能产生指令重排
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class Singleton5 {

    private static Singleton5 singleton;

    private Singleton5(){}

    public static Singleton5 getInstance(){
        if (singleton == null){
            //当几个程序都执行到此处，都重新创建
            synchronized (Singleton5.class){
                //此处再次判断下 保证只创建一个
                if (singleton == null){
                    singleton = new Singleton5();
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
                    System.out.println(Singleton5.getInstance().hashCode());
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
