/* 2중 for문을 이용한 구구단을 출력해보자.
 * 
 */


package Day3;

public class Problem2 {

	public static void main(String [] args) {
		for(int i=1;i<10; i++, System.out.println()) {
			for(int j=1; j<10; j++, System.out.print('\t')) { //tab만큼 거리를 두었음
				System.out.print("|   " + j + "*" + i + "=" + i*j);
			}
		}
	}
}

