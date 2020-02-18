package com.zhangyongsic.study.design.factory;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class FactoryTest {
    public static void main(String[] args) {
        AbstractFoodFactory factory = new LanZhouFoodFactory();
        factory.createNoodles().taste();
        factory.createWater().price();
    }
}
