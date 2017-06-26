/*예외발생
 * 0으로 나눠졌을 때의 오류를 예외처리해보자.
 * ArithmeticException예외 발생
 */


package Day3;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.println("나뉨수를 입력해라: ");
		dividend = a.nextInt();
		System.out.println("나눗수를 입력해라: ");
		divisor = a.nextInt();
		
		//0이 나누어질 때의 예외처리를 해주기위해
		try {
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 " + dividend/divisor + "입니다.");
		}
		catch(ArithmeticException e) { // 0이 나누어졌을때의 오류를 처리하는 것!
			System.out.println("0을 입력하셨습니다.");
		}
		finally { // finally는 항상 실행이된다. 예외가 발생하든 발생하지 않든
	        System.out.println("끝");
		}
}
}
