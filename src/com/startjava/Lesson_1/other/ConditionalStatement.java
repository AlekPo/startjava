package com.startjava.Lesson_1.other;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 18; //age in years
		char gender = 'W'; //Woman - W, male -M
		float height = 1.6F; //height in meters
		char firstLetterName = 'М';
		if (age > 20) {
			System.out.println("Ты уже не малыш!");
			}
		if (gender == 'M' || gender == 'm') {
			System.out.println("Здорово мужик!");
		}
		if (gender == 'W' || gender == 'w') {
			System.out.println("Здравствуйте леди!");
		}
		if (height < 1.80) {
			System.out.println("Ещё подрастешь!");
		} else {
			System.out.println("Здравствуй, дядя Степа!");
		}
		if (firstLetterName == 'М') {
			System.out.println("Привет загадочный М!");
		} else if (firstLetterName == 'И') {
			System.out.println("Привет загадочный И!");
		} else {
			System.out.println("Привет неизвестный!");
		}
	}
}