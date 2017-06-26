/* 원의 면적을 구하는 공식을 알고리즘으로 표현한 것으로, 공식에 필요한 값들을 PI, radius, circleArea 초기화하고
 * 공식 입력하고, 출력해야한다. 
 * 
 * 
 */
public class Problem2 {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius*radius*PI;
		
		System.out.print("원의 면적 = " + circleArea);
	}
}
