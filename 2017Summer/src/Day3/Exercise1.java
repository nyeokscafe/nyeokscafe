/* 연습문제1. 키보드로 정수형 두 수를 입력하면 해당 범위만 덧셈을 하고 출력하는 함수를 만든다.
 * 함수명은 센스있게 누가봐도 알수있게 작성하자.
 * 10 30 을 입력하면 -> 10+11+12+.......+29+30=420 이런식으로 나오도록
 */

package Day3;
import java.util.Scanner;

public class Exercise1 {
	
	public static void plusMan(int start, int end) { // int plusMan이라고 하면 return을 해줘야하지만. 여기서는 굳이 반복문에서 출력다되기에 return 따로 할 필요가 없지.
		                                             //즉, void형으로 void plusMan 하면 리턴 반환하지 않아도 되는것(생략 가능)임
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
		// 반복문의 결과 start+..+end=뭐다 를 리턴하고싶은데 >> ***여기서는 반복문에서의 결과가 이미 다 출력하니까 반환을 안해도 이 함수가 호출되면 다 출력이 되는것이야
				
	}
	
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int start = a.nextInt();  //키보드로 입력받았다는 것을 표현해주고
		int end = a.nextInt();
		plusMan(start, end); //위에 선언한 함수를 활용해야하니까 언급해줘야해.
	}

}
