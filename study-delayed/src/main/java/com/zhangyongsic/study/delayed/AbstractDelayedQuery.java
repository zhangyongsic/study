package com.zhangyongsic.study.delayed;

import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.concurrent.DelayQueue;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/20
 */
public abstract class AbstractDelayedQuery {

    protected DelayQueue<Delayed> delayQueue =  new DelayQueue<Delayed>();

    @PostConstruct
    public void init() {
        initDelayQueue();
        //守护进程 处理
        new Thread(new Runnable() {
            public void run() {
                Delayed delayed = null;
                while (true) {
                    try {
                        delayed = delayQueue.take();
                        //设置添加次自动处理的处理者信息
                        runDelayQueue(delayed);
                    } catch (Exception e) {
                    }finally {
                        removeDelayQueue(delayed);
                    }
                }
            }
        }).start();
    }

    /**
     * 初始化
     */
    protected abstract void initDelayQueue();

    /**
     * 处理
     * @param delayed
     */
    protected abstract void runDelayQueue(Delayed delayed);



    /**加入延迟消息队列**/
    public boolean addDelayQueue(Delayed delayed){
        return delayQueue.add(delayed);
    }

    /**从延迟队列中移除**/
    public void removeDelayQueue(Delayed delayed){
        for (Iterator<Delayed> iterator = delayQueue.iterator(); iterator.hasNext();) {
            Delayed queue = iterator.next();
            if(delayed.getTargetId().equals(queue.getTargetId())){
                delayQueue.remove(queue);
            }
        }
    }
}
