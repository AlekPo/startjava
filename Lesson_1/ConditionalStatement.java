public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 18; //age in years
		char gender = 'W'; //Woman - W, male -M
		float height = 1.6F; //height in meters
		char firstLetterName = '�';
		if (age > 20) {
			System.out.println("�� ��� �� �����!");
			}
		if (gender == 'M' || gender == 'm') {
			System.out.println("������� �����!");
		}
		if (gender == 'W' || gender == 'w') {
			System.out.println("������������ ����!");
		}
		if (height < 1.80) {
			System.out.println("��� ����������!");
		} else {
			System.out.println("����������, ���� �����!");
		}
		if (firstLetterName == '�') {
			System.out.println("������ ���������� �!");
		} else if (firstLetterName == '�') {
			System.out.println("������ ���������� �!");
		} else {
			System.out.println("������ �����������!");
		}
	}
}