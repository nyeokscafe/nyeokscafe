/* 2017.06.22.��. by������
 * ������ ���� Ŭ������ ������.
 * Ŭ������ �̸��� HomeWork1�̴�. ���α׷��� ���۵Ǵ� �����帧�� ������ �ִ�.
 * Scanner�� �̿��Ͽ� ������ 3�� ���޾� �Է¹ް� 3���� ���� �ﰢ���� ���� �� �ִ����� �Ǻ��϶�.
 * �Ǻ��� isEnableTriangle �Լ��� ���ش�.
 * �ﰢ���� �����Ϸ��� �� ���� ���� �ٸ� �� ���� �պ��� �ݵ�� Ŀ���Ѵ�.
 * 
 * Input: 10 7 5 -> Output: "�ﰢ���� ���� �� ����"
 * Input: 1 2 3 -> Output: "�ﰢ���� ���� �� ����"
 */

import java.util.Scanner;
public class HomeWork1 {

	public static boolean isEnableTriangle(int x, int y, int z){
		if (x < y+z && y < x+z && z < x+y) 
			return true;
		else
			return false;
	}
	
	public static void main(String [] args) {
			Scanner a = new Scanner(System.in);
			int x = a.nextInt();
			int y = a.nextInt();
			int z = a.nextInt();
			if(isEnableTriangle(x, y, z) == true) { 
		        System.out.println("�ﰢ���� ���� �� ����");
			}
			else {
		        System.out.println("�ﰢ���� ���� �� ����");

			}
	}
}

