
/*
 * Scanner�� �̿��Ͽ� ������ �ϳ��� �Է¹޴´�.
 * Exercise3 Ŭ������ isAlphabet�޼ҵ带 ������ �ְ� �� �޼ҵ�� ���ڸ� �˻��Ͽ� ���������� �ƴ����� �Ǻ���.
 * �����ڰ� �ƴϸ� "�����ڰ� �ƴմϴ�."��� ���ڿ��� ����ϰ� �����ڰ� ������ �빮���� ��� �ҹ��ڷ� ����Ѵ�.
 * �ڹٿ��� �����ϴ� CharacterŬ������ �̿��Ѵ�. Character.isUpperCase, Character.toLowerCase
 */

/*
import java.util.Scanner;

public class Exercise3 {
	public static void main(String [] args) {
	Scanner a = new Scanner(System.in);
	
	Character.toLowerCase(a.next());
	
	System.out.println(a.next() + " -> " + x);
	}
}
*/
import java.util.Scanner;

public class Exercise3 {
	public static boolean isAlphabet(char i) { // ĳ���� i�� �������� �ƴ����� �Ǻ��ؾ���
		if((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) //�빮�� �̸� �Ǵ� �ҹ����̸�. �켱���������� �տ������� ó���Ѵ�.
			return true;
		return false; //���Ͽ����� else �����ص� ��. true�ƴϸ� false�� ���⶧����
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		char result = 0; // �ʱ�ȭ���ְ�
		
		char x = a.next().charAt(0); //���� x�� �̰��� �������. ���ϰ� �������ؼ�
		 // 0�� index ù��°���� char������ �ٲ��شٴ� ���� �߰��ѰŴ�. ��, �Է¹����� ���������� �ް�

		if(isAlphabet(x) == false) { //x��� �Լ��� ����Ͽ� �Է¹������� ��Ҿ�
	        System.out.println("�����ڰ� �ƴմϴ�.");
		}
		else {
			if(Character.isUpperCase(x)) { //x�� ���� ���� �빮���϶�
		           result = Character.toLowerCase(x);
			}
			else result = x;
		}
		System.out.println(" " + result);
}}