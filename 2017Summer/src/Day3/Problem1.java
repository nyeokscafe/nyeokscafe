/* 2017.06.26. Problem1. 1���� 10������ ���� ���ϴ� ���α׷�
 * ������� ����ϴ� ���� �ƴ϶� 1+2+3..+9+10=55 ��� ������ �Բ� ����Ϸ��� �� ��
 */

package Day3;

public class Problem1 {
	
	public static void main(String [] args) {
		int sum = 0; // sum�̶�� ������ 0���� �ʱ�ȭ���ѳ���
		for(int i=1; i<=10; i++){
			sum = sum + i;
			
			System.out.print(i);
			if(i==10) {
				System.out.print("=");
				System.out.println(sum);
			}
			else
				System.out.print("+");
		}
	}
}
