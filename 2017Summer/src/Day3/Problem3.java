/*�Է��� ���� ���� ����� ���غ���. �Ҹ�Ȯ�� Ƚ���� �ݺ��� �ؾ��ϴϱ� -> while���� ��� 
 * 0�� �Է��ϸ� �ݺ��� ��������
 */

package Day3;

import java.util.Scanner;
public class Problem3 {

	public static void main(String [] arsgs) {
		Scanner a = new Scanner(System.in);
		int n =0;
		double sum =0;
		int i;
		
		while((i = a.nextInt()) != 0) {       // 0�̸� �ݺ��� �����ϱ�
			sum = sum +i;
			n++;
		}
		System.out.println("�Էµ� ���� ������ " + n + "���̸� ����� "+ sum/n + "�Դϴ�.");
		}
			
}
