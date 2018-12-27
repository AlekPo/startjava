public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			if (i == 0) {
				System.out.println("Все числа от 0 до 20:");
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		int g = 6;
		System.out.println("Все числа от 6 до -6, с шагом итерации 2:");
		while (g >= -6) {
			System.out.print(g + " ");
			g = g - 2;
		}
		System.out.println();

		int k = 10;
		int summ = 0;
		System.out.println("Сумма всех нечетных чисел от 10 до 20:");
		do {
			if ((k % 2) != 0) {
				// System.out.println("Сумма = " + summ + "+ " + k);
				summ = summ + k;
			}
			k++;
		} while (k < 21);
		System.out.println(summ);
	}
}