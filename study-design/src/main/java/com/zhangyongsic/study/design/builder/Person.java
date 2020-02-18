package com.zhangyongsic.study.design.builder;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/18
 */

public class Person {

    private int id;
    private String name;
    private int age;
    private double height;

    public Person(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;
        private double height;
        public Builder(){

        }

        public Builder(int id,String name){
            this.id = id;
            this.name = name;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder height(double height){
            this.height = height;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Builder(1,"张勇").age(21).height(168).build();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1");
        System.out.println(person);
    }

}
