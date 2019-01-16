package com.startjava.Lesson_2_3.other;

public class JaegerSetter {

    private String modelName;// = "Bracer Phoenix";
    private String mark;// = "Mark-5";
    private String origin;// = "USA";
    private float height;// = 70.9F;
    private float weight;// = 2.1F;
    private int speed;// = 3;
    private int strength;// = 8;
    private int armor;// = 9;

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    String scanKaiju() {
        return "nothing";
    }

    void useVortexCannon() {

    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Float getHeight() {
        return height;
    }
    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

}