package com.chapter14.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Dog("小李", 3));
        list.add(new Dog("小o", 300));
        list.add(new Dog("小p", 30));

        for (Object dog : list) {
            System.out.println("dog=" + dog);

        }

        System.out.println("===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
