
//?????????????????????????????????
/*
 * Ű����κ��� ���ڸ� �Է¹ް� ȭ�鿡 ����ϴ� ��
 */
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
	public static void main(String [] args){
		InputStreamReader rd = new InputStreamReader(System.in); // Ű����� �Է¹޾Ƽ�
		
		try{
			while(true) {                 //Ű����� �Է¹��� ���� a�� �����ϴµ� a�� -1�̸� �������. a�� ���������� ����ȯ�Ͽ� ���
				int a = rd.read();
				if(a == -1)       // ctrl+z�� ������ -1�� �ڵ����� �Էµȴ�
					break;
				System.out.println((char)a);
			}
		}
		catch (IOException e) {
			System.out.println("�Է� ���� �߻�");
		}
	}
}
