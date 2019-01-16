package com.startjava.Lesson_2_3.other;

public class PersonTest {
    public static void main(String[] args) {
        Person personOne = new Person();
        System.out.println("Name = " + personOne.name);
        System.out.println("Sex = " + personOne.sex);
        System.out.println("Weight = " + personOne.weight);
        personOne.run();
        System.out.println("I am teach Java = " + personOne.teachJava());
    }
}