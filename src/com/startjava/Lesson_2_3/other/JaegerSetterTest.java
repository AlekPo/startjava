package com.startjava.Lesson_2_3.other;

public class JaegerSetterTest {
    
    public static void main(String[] args) {

        JaegerSetter jagerOne = new JaegerSetter();
        jagerOne.setModelName("Bracer Phoenix");
        jagerOne.setMark("Mark-5");
        jagerOne.setOrigin("USA");
        jagerOne.setHeight(70.9F);
        jagerOne.setWeight(2.1F);
        jagerOne.setSpeed(3);
        jagerOne.setStrength(8);
        jagerOne.setArmor(9);

        JaegerSetter jagerTwo = new JaegerSetter();
        jagerTwo.setModelName("Saber Athena");
        jagerTwo.setMark("Mark-7");
        jagerTwo.setOrigin("China");
        jagerTwo.setHeight(76.9F);
        jagerTwo.setWeight(1.6F);
        jagerTwo.setSpeed(4);
        jagerTwo.setStrength(9);
        jagerTwo.setArmor(12);

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