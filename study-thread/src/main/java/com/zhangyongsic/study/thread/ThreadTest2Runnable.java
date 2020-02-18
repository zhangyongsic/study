package com.zhangyongsic.study.thread;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class ThreadTest2Runnable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
           Thread thread =  new Thread(new ThreadTest2Runnable());
           thread.setName("Thread-"+i);
           thread.start();
        }
    }

}
