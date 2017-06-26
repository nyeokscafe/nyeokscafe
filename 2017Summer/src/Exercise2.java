//double형의 x의 시작점, y의 시작점, x의 끝점, y의 끝점을 입력받으면 사각형의 면적을 반환해주는 rectangle메소드를 가짐
// double형의 원의 반지름을 입력받으면, 원의 면적을 반환해주는 circle메소드를 가짐. 입력받지 않은 변수는 상수로 만듬
// 출력결과 : "(0,0)에서 (3,4)까지 마우스를 드래그한 사각형의 면적은 12.0입니다." , "원의 반지름이 3일때 원의 면적은 28.26입니다."

public class Exercise2 {

	public static void main(String [] args) {
		int x1 = 0;
		int x2 = 3;
		int y1 = 0;
		int y2 = 4;
		double rectangle = 0;
		double radius = 3;
		final double PI = 3.14;
		double circle = 0;
		
		rectangle = (x2-x1)*(y2-y1);
		circle = radius*radius*PI;
		
		System.out.println("(0,0)에서 (3,4)까지 마우스를 드래그한 사각형의 면적은 " + rectangle + "입니다.");
		System.out.println("원의 반지름이 3일 때 원의 면적은 " + circle + "입니다.");
		
		
		
	}
}
