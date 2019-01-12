public class Person {

	String sex = "Male";
	String name = "Ivan";
	int height = 170;
	float weight = 74.5F;
	int age = 99;

	void go() {
		//Метод - идти
	}

	String sit() {
		//Метод - сидеть
		return "I am sitting";
	}

	String run() {
		//Метод - бежать
		System.out.println("I am run");
		return "I am run";
	}

	String speak() {
		//Метод - говорить
		System.out.println("I am speak");
		return "I am speak";
	}

	boolean teachJava() {
		//Метод - учить Java
		return true;
	}
}