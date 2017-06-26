/*try-catch문 예외. 배열이 주어졌을 때 배열의 범위를 넘어선 것을 요구할 때 발생시키는 예외처리
 * 
 */

/*
package Day3;

public class Problem7 {

	public static void main(String [] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		for (int i =0; i<= 5; i++) { // new int[5]라서 5개인데 0~5까지면 총 6개를 실행하라고하니 예외가 발생하겠지
			intArray[i] = i+intArray[i];
			System.out.println("intArray[" + i + "]=" + intArray[i]);
			
			try {
				System.out.println(intArray[5]);
			}
			catch {
				System.out.println();
			}
		}
	}
}
*/

package Day3;

public class Problem7 {

	public static void main(String [] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		try {    // try-catch를 아예 for문 바깥에 감싸는 형태로 한다. for문 자체가 문제가 있으니까. 굳이 try문에서 안해도됨
		for (int i =0; i<= 5; i++) { // new int[5]라서 5개인데 0~5까지면 총 6개를 실행하라고하니 예외가 발생하겠지
			intArray[i] = i+intArray[i];
			System.out.println("intArray[" + i + "]=" + intArray[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 발생");  
		}
	}
}

			