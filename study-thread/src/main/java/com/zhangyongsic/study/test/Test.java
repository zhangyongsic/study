package com.zhangyongsic.study.test;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/19
 */
public class Test {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                '}';
    }

    public static Test test(){
        Test test = new Test();
        try {
            test.setAge(10);
            return test;
        }finally {
            test.setAge(12);
        }
    }


    public static int getInt(){
        int i =10;
        try {
            return  i;
        }finally {
            i=12;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(getInt());
    }

}
