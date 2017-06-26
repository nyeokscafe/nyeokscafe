/*
20170622 목요일
[연습문제 1] 클래스의 이름은 Exercise1
                  프로그램이 시작되는 실행흐름 가짐. 
                  두 정수 또는 두 부동소수점 자료형의 변수들을 받으면 두 수 중에 큰 수를 결과로 반환해주는 Max 메소드 가짐
                  문자열 출력 "4와 3중 큰 수는 4입니다. 5.5와 5.2중 큰 수는 5.5입니다."
*/
 
/* <내가 시도한것>
public class Exeercise1 {

	public static int Max(int a, int b) {
		
		return 큰값 
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		double c = 5.5;
		double d = 5.2;
		System.out.println("4와 3중 큰 수는 4입니다. 5.5와 5.2중 큰 수는 5.5입니다.");
		
		
	}
}
*/

//같이 해보면?

public class Exeercise1 {
	//1.처음에 프로그램 시작을 위해 main함수를 만든다
			//2.접근지정자를 static으로 지정. 두개의 변수중 큰것을 반환해야하니까 반환형은 int
		public static int Max(int a, int b) { //조건문으로 큰 수를 판별해야겠지?
			if(a>b)
				return a;
			else 
				return b;
			//double형도 만들어줘야겠지.
		}
		public static double Max(double a, double b) { //매개변수 타입, 개수 다르면 함수이름 똑같은것 쓰기가능
			if(a>b)
				return a;
			else 
				return b;
		}
		public static void main(String [] args) {
			System.out.println("4와 3중 큰 수는 " + Max(4, 3)+"입니다. 5.5와 5.2중 큰 수는 " 
		                       + Max(5.5,5.2) + "입니다."); 
			//Max(4,3)은 int로 인식하고, Max(5.5,5.2)는 double로 인식한다.
			
		}
	}







