/* 2017.06.26. Problem1. 1부터 10까지의 합을 구하는 프로그램
 * 결과값만 출력하는 것이 아니라 1+2+3..+9+10=55 라는 과정도 함께 출력하려고 할 때
 */

package Day3;

public class Problem1 {
	
	public static void main(String [] args) {
		int sum = 0; // sum이라는 변수도 0으로 초기화시켜놓고
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
