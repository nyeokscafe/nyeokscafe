/*���ܹ߻�
 * 0���� �������� ���� ������ ����ó���غ���.
 * ArithmeticException���� �߻�
 */


package Day3;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.println("�������� �Է��ض�: ");
		dividend = a.nextInt();
		System.out.println("�������� �Է��ض�: ");
		divisor = a.nextInt();
		
		//0�� �������� ���� ����ó���� ���ֱ�����
		try {
			System.out.println(dividend+"�� "+divisor+"�� ������ ���� " + dividend/divisor + "�Դϴ�.");
		}
		catch(ArithmeticException e) { // 0�� �������������� ������ ó���ϴ� ��!
			System.out.println("0�� �Է��ϼ̽��ϴ�.");
		}
		finally { // finally�� �׻� �����̵ȴ�. ���ܰ� �߻��ϵ� �߻����� �ʵ�
	        System.out.println("��");
		}
}
}
