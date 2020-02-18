package com.zhangyongsic.study.thread;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class ThreadTest1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i= 0;i<10;i++){
            ThreadTest1 threadTest1 = new ThreadTest1();
            threadTest1.setName("Thread-"+i);
            threadTest1.start();
        }
    }

}
