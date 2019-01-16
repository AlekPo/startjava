package com.startjava.Lesson_2_3.robot;

public class JaegerTest {
    
    public static void main(String[] args) {

        Jaeger jagerOne = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.9F, 2.1F, 3, 8, 9);

        Jaeger jagerTwo = new Jaeger("Saber Athena", "Mark-7", "China", 76.9F, 1.6F, 4, 9, 12);

        System.out.println("modelName = " + jagerOne.getModelName() +"\t" + jagerTwo.getModelName());
        System.out.println("mark =      " + jagerOne.getMark() +"\t" + jagerTwo.getMark());
        System.out.println("Origin =    " + jagerOne.getOrigin() +"\t" + jagerTwo.getOrigin());
        System.out.println("height =    " + jagerOne.getHeight() +"\t" + jagerTwo.getHeight());
        System.out.println("weight =    " + jagerOne.getWeight() +"\t" + jagerTwo.getWeight());
        System.out.println("speed =     " + jagerOne.getSpeed() +"\t" + jagerTwo.getSpeed());
        System.out.println("strength =  " + jagerOne.getStrength() +"\t" + jagerTwo.getStrength());
        System.out.println("armor =     " + jagerOne.getArmor() +"\t" + jagerTwo.getArmor());

        System.out.println();
        System.out.println("report " + jagerOne.getModelName() + " " + jagerOne.drift());
        System.out.println("report " + jagerTwo.getModelName() + " " + jagerTwo.drift());
        
        System.out.println();
        System.out.println("scanKaiju " + jagerOne.getModelName() + " detected? " + jagerOne.scanKaiju());
        jagerOne.scanKaiju();
        System.out.println("scanKaiju " + jagerTwo.getModelName() + " detected? " + jagerTwo.scanKaiju());
        jagerTwo.scanKaiju();

        System.out.println();
        System.out.print(jagerOne.getModelName() + " move? ");
        jagerOne.move();
        System.out.print(jagerTwo.getModelName() + " move? ");
        jagerTwo.move();
    }
}