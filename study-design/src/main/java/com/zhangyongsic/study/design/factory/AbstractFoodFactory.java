package com.zhangyongsic.study.design.factory;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/18
 */
public abstract class AbstractFoodFactory {
    /**
     *
     * @return
     */
    protected abstract INoodles createNoodles();
    protected abstract IWater createWater();

}
