package Day3; // 2차원 배열을 설명하기 위한것임 연습문제2와 무관함.
// 이차원배열에 값을 넣기위해서는 이중 for문을 써야된다.

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
