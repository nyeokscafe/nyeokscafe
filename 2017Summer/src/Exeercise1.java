/*
20170622 �����
[�������� 1] Ŭ������ �̸��� Exercise1
                  ���α׷��� ���۵Ǵ� �����帧 ����. 
                  �� ���� �Ǵ� �� �ε��Ҽ��� �ڷ����� �������� ������ �� �� �߿� ū ���� ����� ��ȯ���ִ� Max �޼ҵ� ����
                  ���ڿ� ��� "4�� 3�� ū ���� 4�Դϴ�. 5.5�� 5.2�� ū ���� 5.5�Դϴ�."
*/
 
/* <���� �õ��Ѱ�>
public class Exeercise1 {

	public static int Max(int a, int b) {
		
		return ū�� 
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		double c = 5.5;
		double d = 5.2;
		System.out.println("4�� 3�� ū ���� 4�Դϴ�. 5.5�� 5.2�� ū ���� 5.5�Դϴ�.");
		
		
	}
}
*/

//���� �غ���?

public class Exeercise1 {
	//1.ó���� ���α׷� ������ ���� main�Լ��� �����
			//2.���������ڸ� static���� ����. �ΰ��� ������ ū���� ��ȯ�ؾ��ϴϱ� ��ȯ���� int
		public static int Max(int a, int b) { //���ǹ����� ū ���� �Ǻ��ؾ߰���?
			if(a>b)
				return a;
			else 
				return b;
			//double���� �������߰���.
		}
		public static double Max(double a, double b) { //�Ű����� Ÿ��, ���� �ٸ��� �Լ��̸� �Ȱ����� ���Ⱑ��
			if(a>b)
				return a;
			else 
				return b;
		}
		public static void main(String [] args) {
			System.out.println("4�� 3�� ū ���� " + Max(4, 3)+"�Դϴ�. 5.5�� 5.2�� ū ���� " 
		                       + Max(5.5,5.2) + "�Դϴ�."); 
			//Max(4,3)�� int�� �ν��ϰ�, Max(5.5,5.2)�� double�� �ν��Ѵ�.
			
		}
	}







