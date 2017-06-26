/*입력한 수에 대한 평균을 구해보자. 불명확한 횟수의 반복을 해야하니까 -> while문을 사용 
 * 0을 입력하면 반복문 나가야함
 */

package Day3;

import java.util.Scanner;
public class Problem3 {

	public static void main(String [] arsgs) {
		Scanner a = new Scanner(System.in);
		int n =0;
		double sum =0;
		int i;
		
		while((i = a.nextInt()) != 0) {       // 0이면 반복문 종료하기
			sum = sum +i;
			n++;
		}
		System.out.println("입력된 수의 개수는 " + n + "개이며 평균은 "+ sum/n + "입니다.");
		}
			
}
