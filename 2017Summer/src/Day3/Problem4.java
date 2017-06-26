/*입력한 양수 중 큰 값 구하라
 * 
 */


package Day3;
import java.util.Scanner;
public class Problem4 {

	public static void main(String [] arsg) {
		System.out.println("양수 5개를 입력하세요.");
		Scanner a = new Scanner(System.in);
		int intArray[] = new int[5]; // 5개의 저장공간 배열을 만들고
		int max = 0;                   // 최대값을 구해야하니 일단 변수 max에 초기화를 해주고
		
		for(int i=0; i<intArray.length; i++) {    // 배열의 길이만큼 ==즉 배열의 크기(5)만큼까지 반복
			intArray[i] = a.nextInt();            // 입력받은 값을 배열의 값에 저장하고
			if(intArray[i] > max)                 // 입력받은 값이 max(초기화)보다 크면 
				max = intArray[i];                // max를 큰 것으로 다시 바꿔준다. 결국엔 가장 큰 놈이 max에 들어가있겠지.
		}
		System.out.println("입력된 수에서 가장 큰 수는" + max + "입니다.");
	}
}
