//double���� x�� ������, y�� ������, x�� ����, y�� ������ �Է¹����� �簢���� ������ ��ȯ���ִ� rectangle�޼ҵ带 ����
// double���� ���� �������� �Է¹�����, ���� ������ ��ȯ���ִ� circle�޼ҵ带 ����. �Է¹��� ���� ������ ����� ����
// ��°�� : "(0,0)���� (3,4)���� ���콺�� �巡���� �簢���� ������ 12.0�Դϴ�." , "���� �������� 3�϶� ���� ������ 28.26�Դϴ�."

public class Exercise2 {

	public static void main(String [] args) {
		int x1 = 0;
		int x2 = 3;
		int y1 = 0;
		int y2 = 4;
		double rectangle = 0;
		double radius = 3;
		final double PI = 3.14;
		double circle = 0;
		
		rectangle = (x2-x1)*(y2-y1);
		circle = radius*radius*PI;
		
		System.out.println("(0,0)���� (3,4)���� ���콺�� �巡���� �簢���� ������ " + rectangle + "�Դϴ�.");
		System.out.println("���� �������� 3�� �� ���� ������ " + circle + "�Դϴ�.");
		
		
		
	}
}
