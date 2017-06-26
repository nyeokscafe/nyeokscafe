/*try-catch�� ����. �迭�� �־����� �� �迭�� ������ �Ѿ ���� �䱸�� �� �߻���Ű�� ����ó��
 * 
 */

/*
package Day3;

public class Problem7 {

	public static void main(String [] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		for (int i =0; i<= 5; i++) { // new int[5]�� 5���ε� 0~5������ �� 6���� �����϶���ϴ� ���ܰ� �߻��ϰ���
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
		
		try {    // try-catch�� �ƿ� for�� �ٱ��� ���δ� ���·� �Ѵ�. for�� ��ü�� ������ �����ϱ�. ���� try������ ���ص���
		for (int i =0; i<= 5; i++) { // new int[5]�� 5���ε� 0~5������ �� 6���� �����϶���ϴ� ���ܰ� �߻��ϰ���
			intArray[i] = i+intArray[i];
			System.out.println("intArray[" + i + "]=" + intArray[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �߻�");  
		}
	}
}

			