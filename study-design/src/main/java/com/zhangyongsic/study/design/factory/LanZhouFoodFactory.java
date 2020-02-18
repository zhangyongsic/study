package com.zhangyongsic.study.design.factory;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/18
 */
public class LanZhouFoodFactory extends AbstractFoodFactory{

    @Override
    protected INoodles createNoodles() {
        return new INoodles() {
            public void taste() {
                System.out.println("好吃，就是牛肉太少");
            }
        };
    }

    @Override
    protected IWater createWater() {
        return new IWater() {
            public void price() {
                System.out.println("汤免费加，不要钱");
            }
        };
    }
}
