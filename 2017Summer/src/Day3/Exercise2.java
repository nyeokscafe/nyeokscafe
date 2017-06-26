/*출력할 구구단을 차례대로 입력하면 입력한 순서대로 구구단을 출력해준다. 즉 7 2 -1 이면 7단, 2단 종료 / 3 2 6 7 -1이면 3단 2단 6단 7단 종료
 * 마지막 -1이 종료를 나타내는 수이다.
 * 구구단을 출력해주는 부분은 함수로 작성한다. Problem2+3을 같이 고려
 */

package Day3;
import java.util.Scanner;
public class Exercise2 {

	public static void googoodan(int x) { //void형으로 int형 정수 x하나를 주면(7단이면 7을 주면 7단만 출력하면되니까) 그것에 대한 함수를 출력해야하니까
		for (int i=1; i<10; i++) {
			System.out.println(x+ "*" + i + "=" + x*i);
			}
		System.out.println();
	}
		
	
	public static void main(String [] args) {
		Scanner a = new Scanner(System.in);
		int number = 0; // 굳이 초기화하지 않아도되지만, 나중에 예외처리할때 편리하게 하기위함임.
		System.out.println("단수를 입력하세요.");
		while((number = a.nextInt()) != -1) {      //입력받은 것을 number에 할당하고, -1과의 비교를 통해 -1이 아니면 googoodan(number)을 호출한다.
			googoodan(number);
		}
		
	}
}
