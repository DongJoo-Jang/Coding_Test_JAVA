import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GooDeeQuiz {

	public static void main(String[] args) {
		
		
		System.out.println(solution1(123));
		int[] arr = {5,3,9,13};
		System.out.println(solution2(arr,8));
		
	}
	
	public static int solution1(int n) {
		
		int result =0;
		int temp = n;
		int moduleSum = 0;
		while(temp >=10) { // 10���� ������ ��� �ʿ������ 10���� Ŭ ���� ���
			moduleSum = 0;
			while(temp >0) {
			moduleSum += temp % 10; //���ڸ��� ���ϸ鼭 ����
			temp = temp/10;
			}
			temp = moduleSum;
		}
		result = temp;
		return result;
	}
	public static boolean solution2(int[] arr, int n) {
		boolean result = false;
		int index = 0,index2  =0;
		int num1=0, num2=0,sum = 0;

		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i<arr.length;i++) {  //�迭->����Ʈȭ
			if(arr[i] < n) { // ���ؼ� ���Ҳ��ϱ� Ÿ�ٺ��� �������� ����Ʈ �߰�
				list.add(arr[i]);
			}
		}
		while(index < list.size()-1 ){
			index2 = index+1;
			while(index2 < list.size()-1 ) {
				
				num1 = list.get(index);
				num2 = list.get(index2);
				sum  = num1 + num2;
			}
		}
		return result;
		
	}
	
	
}
