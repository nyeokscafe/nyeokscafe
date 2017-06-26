
//?????????????????????????????????
/*
 * 키보드로부터 문자를 입력받고 화면에 출력하는 예
 */
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
	public static void main(String [] args){
		InputStreamReader rd = new InputStreamReader(System.in); // 키보드로 입력받아서
		
		try{
			while(true) {                 //키보드로 입력받은 것을 a에 저장하는데 a가 -1이면 실행멈춤. a는 문자형으로 형변환하여 출력
				int a = rd.read();
				if(a == -1)       // ctrl+z를 누르면 -1이 자동으로 입력된다
					break;
				System.out.println((char)a);
			}
		}
		catch (IOException e) {
			System.out.println("입력 오류 발생");
		}
	}
}
