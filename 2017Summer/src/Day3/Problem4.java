/*�Է��� ��� �� ū �� ���϶�
 * 
 */


package Day3;
import java.util.Scanner;
public class Problem4 {

	public static void main(String [] arsg) {
		System.out.println("��� 5���� �Է��ϼ���.");
		Scanner a = new Scanner(System.in);
		int intArray[] = new int[5]; // 5���� ������� �迭�� �����
		int max = 0;                   // �ִ밪�� ���ؾ��ϴ� �ϴ� ���� max�� �ʱ�ȭ�� ���ְ�
		
		for(int i=0; i<intArray.length; i++) {    // �迭�� ���̸�ŭ ==�� �迭�� ũ��(5)��ŭ���� �ݺ�
			intArray[i] = a.nextInt();            // �Է¹��� ���� �迭�� ���� �����ϰ�
			if(intArray[i] > max)                 // �Է¹��� ���� max(�ʱ�ȭ)���� ũ�� 
				max = intArray[i];                // max�� ū ������ �ٽ� �ٲ��ش�. �ᱹ�� ���� ū ���� max�� ���ְ���.
		}
		System.out.println("�Էµ� ������ ���� ū ����" + max + "�Դϴ�.");
	}
}
