/*����� �������� ���ʴ�� �Է��ϸ� �Է��� ������� �������� ������ش�. �� 7 2 -1 �̸� 7��, 2�� ���� / 3 2 6 7 -1�̸� 3�� 2�� 6�� 7�� ����
 * ������ -1�� ���Ḧ ��Ÿ���� ���̴�.
 * �������� ������ִ� �κ��� �Լ��� �ۼ��Ѵ�. Problem2+3�� ���� ���
 */

package Day3;
import java.util.Scanner;
public class Exercise2 {

	public static void googoodan(int x) { //void������ int�� ���� x�ϳ��� �ָ�(7���̸� 7�� �ָ� 7�ܸ� ����ϸ�Ǵϱ�) �װͿ� ���� �Լ��� ����ؾ��ϴϱ�
		for (int i=1; i<10; i++) {
			System.out.println(x+ "*" + i + "=" + x*i);
			}
		System.out.println();
	}
		
	
	public static void main(String [] args) {
		Scanner a = new Scanner(System.in);
		int number = 0; // ���� �ʱ�ȭ���� �ʾƵ�������, ���߿� ����ó���Ҷ� ���ϰ� �ϱ�������.
		System.out.println("�ܼ��� �Է��ϼ���.");
		while((number = a.nextInt()) != -1) {      //�Է¹��� ���� number�� �Ҵ��ϰ�, -1���� �񱳸� ���� -1�� �ƴϸ� googoodan(number)�� ȣ���Ѵ�.
			googoodan(number);
		}
		
	}
}
