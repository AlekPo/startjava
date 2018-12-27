public class Variable {
	public static void main(String[] args) {
		byte b = 2; //Количество ядер
		short s = 4; //Оперативная память
		int i = 1803; //Версия Windows
		long l = 9_223_372_036_854_775_807L; //Максимальное значение long
		float f = 3.70F; //Частота процессора
		double d = 17134.472D; //Сборка операционной системы
		char c = 'W'; //Просто W
		boolean bl = false;

		System.out.println("Количество ядер: " + b);
		System.out.println("Оперативная память: " + s);
		System.out.println("Версия Windows: " + i);
		System.out.println("Максимальное значение long: " + l);
		System.out.println("Частота процессора: " + f + " GHz");
		System.out.println("Сборка операционной системы: " + d);
		System.out.println("char c = " + c);
		System.out.println("boolean b = " + bl);
	}
}
