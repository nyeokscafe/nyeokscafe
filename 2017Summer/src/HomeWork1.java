/* 2017.06.22.목. by정운혁
 * 다음과 같은 클래스를 만들어라.
 * 클래스의 이름은 HomeWork1이다. 프로그램이 시작되는 실행흐름을 가지고 있다.
 * Scanner를 이용하여 정수를 3개 연달아 입력받고 3개의 수로 삼각형을 만들 수 있는지를 판별하라.
 * 판별은 isEnableTriangle 함수가 해준다.
 * 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야한다.
 * 
 * Input: 10 7 5 -> Output: "삼각형을 만들 수 있음"
 * Input: 1 2 3 -> Output: "삼각형을 만들 수 없음"
 */

import java.util.Scanner;
public class HomeWork1 {

	public static boolean isEnableTriangle(int x, int y, int z){
		if (x < y+z && y < x+z && z < x+y) 
			return true;
		else
			return false;
	}
	
	public static void main(String [] args) {
			Scanner a = new Scanner(System.in);
			int x = a.nextInt();
			int y = a.nextInt();
			int z = a.nextInt();
			if(isEnableTriangle(x, y, z) == true) { 
		        System.out.println("삼각형을 만들 수 있음");
			}
			else {
		        System.out.println("삼각형을 만들 수 없음");

			}
	}
}

