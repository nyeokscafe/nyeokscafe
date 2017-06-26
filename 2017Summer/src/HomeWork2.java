import java.util.Scanner;
public class HomeWork2 {

	
	public static boolean isEnableTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
		double d12 = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		double d23 = Math.sqrt(Math.pow((x2-x3),2) + Math.pow((y2-y3),2));
		double d31 = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));//피타고라스의 정리
		if (d12 < d23+d31 && d23 < d12+d31 && d31 < d12+d23) 
			return true; 
		else
			return false;

	}
	public static double Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		double area = 0.5*((x1*y2 + x2*y3 + x3*y1)-(x2*y1 + x3*y2 + x1*y3));
		return area;
				
	}
	
	public static void main(String [] args) {
			Scanner a = new Scanner(System.in);
			double x1 = a.nextDouble();
			double y1 = a.nextDouble();
			double x2 = a.nextDouble();
			double y2 = a.nextDouble();
			double x3 = a.nextDouble();
			double y3 = a.nextDouble();
			
			if( isEnableTriangle(2,7,2,3,6,7) == true)
				System.out.println("삼각형의 면적은 " + Triangle(2,7,2,3,6,7) +"입니다.");
			
	}
}
			
			


