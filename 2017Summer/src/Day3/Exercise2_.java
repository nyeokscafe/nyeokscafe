package Day3; // 2���� �迭�� �����ϱ� ���Ѱ��� ��������2�� ������.
// �������迭�� ���� �ֱ����ؼ��� ���� for���� ��ߵȴ�.

public class Exercise2_ {
	public static void main(String [] arsgs) {
		int [][] arr = new int[3][5];
		int number = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = number++;
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
	}
}
