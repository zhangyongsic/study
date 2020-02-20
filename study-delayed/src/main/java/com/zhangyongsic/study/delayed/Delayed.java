package com.zhangyongsic.study.delayed;

import java.util.concurrent.TimeUnit;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/20
 */

public class Delayed implements java.util.concurrent.Delayed {

    private String targetId;
    private long expire ;

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public long getExpire() {
        return expire;
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

    public long getDelay(TimeUnit unit) {
        return 0;
    }

    public int compareTo(java.util.concurrent.Delayed o) {
        return 0;
    }
}
