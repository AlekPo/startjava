package com.startjava.Lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int numberUser = 10;
		int numberComp = 30;

		while (numberComp != numberUser) {
			if (numberUser < numberComp) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
			System.out.println(numberUser + " < " + numberComp);
			++numberUser;
			} else if (numberUser > numberComp) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			System.out.println(numberUser + " > " + numberComp);
			--numberUser;
			}
		}
		System.out.println("Вы угадали!");
		System.out.println(numberUser + " = " + numberComp);
	}
}