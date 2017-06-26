/*
 * Scanner을 이용하여 영문자 하나를 입력받는다.
 * Exercise3 클래스는 isAlphabet메소드를 가지고 있고 이 메소드는 문자를 검사하여 영문자인지 아닌지를 판별함.
 * 영문자가 아니면 "영문자가 아닙니다."라는 문자열을 출력하고 영문자가 맞으면 대문자일 경우 소문자로 출력한다.
 * 자바에서 제공하는 Character클래스를 이용한다. Character.isUpperCase, Character.toLowerCase
 */

/*
import java.util.Scanner;

public class Exercise3 {
	public static void main(String [] args) {
	Scanner a = new Scanner(System.in);
	
	Character.toLowerCase(a.next());
	
	System.out.println(a.next() + " -> " + x);
	}
}
*/

import util.java.Scanner;
public class Exercise3 {
	public static boolean isAlphabet(char i) { // 캐릭터 i가 문자인지 아닌지를 판별해야함
		if((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) //대문자 이면 또는 소문자이면. 우선순위같으니 앞에서부터 처리한다.
			return true;
		return false; //리턴에서는 else 생략해도 됨. true아니면 false로 가기때문에
	}
	
	public static void main(String[] args) {
		java.util.Scanner a = new Scanner (System.in);
		a.next().charAt(0); // 0은 index 첫번째꺼를 char형으로 바꿔준다는 것을 추가한거다. 즉, 입력받은걸 문자형으로 받고
		char result = 0;
		
		char x = a.next().charAt(0); //변수 x에 이것을 담아주자. 편하게 쓰기위해서
		if(isAlphabet(x) == false) { //x라는 함수를 사용하여 입력받은것을 담았어
	        System.out.println("영문자가 아닙니다.");
		}
		else {
			if(Character.toUpperCase(x)) { //x가 가진 값이 대문자일때
		           result = Character.toLowerCase(x);
			}
			else result = x;
		}
		System.out.println(" " + result);
}