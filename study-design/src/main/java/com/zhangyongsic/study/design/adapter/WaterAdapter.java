package com.zhangyongsic.study.design.adapter;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/19
 */
public class WaterAdapter extends  WaterIn implements WaterOut {

    public int out10() {
        int i = in50();
        return i/5;
    }

    public static void main(String[] args) {
        WaterAdapter waterAdapter = new WaterAdapter();
        System.out.println(waterAdapter.out10());
    }
}
