/* ��������1. Ű����� ������ �� ���� �Է��ϸ� �ش� ������ ������ �ϰ� ����ϴ� �Լ��� �����.
 * �Լ����� �����ְ� �������� �˼��ְ� �ۼ�����.
 * 10 30 �� �Է��ϸ� -> 10+11+12+.......+29+30=420 �̷������� ��������
 */

package Day3;
import java.util.Scanner;

public class Exercise1 {
	
	public static void plusMan(int start, int end) { // int plusMan�̶�� �ϸ� return�� �����������. ���⼭�� ���� �ݺ������� ��´ٵǱ⿡ return ���� �� �ʿ䰡 ����.
		                                             //��, void������ void plusMan �ϸ� ���� ��ȯ���� �ʾƵ� �Ǵ°�(���� ����)��
		int sum = 0;
		for(int i=start; i<=end; i++){
			sum = sum + i;
			System.out.print(i);
			if(i==end) {
				System.out.print("=");
				System.out.println(sum);
			}
			else
				System.out.print("+");
			
		}
		// �ݺ����� ��� start+..+end=���� �� �����ϰ������ >> ***���⼭�� �ݺ��������� ����� �̹� �� ����ϴϱ� ��ȯ�� ���ص� �� �Լ��� ȣ��Ǹ� �� ����� �Ǵ°��̾�
				
	}
	
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int start = a.nextInt();  //Ű����� �Է¹޾Ҵٴ� ���� ǥ�����ְ�
		int end = a.nextInt();
		plusMan(start, end); //���� ������ �Լ��� Ȱ���ؾ��ϴϱ� ����������.
	}

}
