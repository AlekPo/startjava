public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			if (i == 0) {
				System.out.println("��� ����� �� 0 �� 20:");
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		int g = 6;
		System.out.println("��� ����� �� 6 �� -6, � ����� �������� 2:");
		while (g >= -6) {
			System.out.print(g + " ");
			g = g - 2;
		}
		System.out.println();

		int k = 10;
		int summ = 0;
		System.out.println("����� ���� �������� ����� �� 10 �� 20:");
		do {
			if ((k % 2) != 0) {
				// System.out.println("����� = " + summ + "+ " + k);
				summ = summ + k;
			}
			k++;
		} while (k < 21);
		System.out.println(summ);
	}
}