import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GooDeeQuiz {

	public static void main(String[] args) {
		

		int[] arrA = {1,3,2,1};
		int[] arrB = {4,2,5,3};
		//int[] arrA = {2,1};
		//int[] arrB = {3,3};
		System.out.println(solution3(arrA,arrB));
		
	}
	

//	public static int solution3(int[] arrA, int[] arrB) {
//		
//		int result = -1;
//		Set<Integer> setA = new HashSet<>();
//		Set<Integer> setB = new HashSet<>();
//		for(int i = 0 ; i < arrA.length; i++) { //Set���� �ؼ� �ߺ�����
//			setA.add(arrA[i]); 
//			setB.add(arrB[i]);
//		}
//		List<Integer> listA = new ArrayList<>(setA); //���� ������ ���ϱ��� ����Ʈȭ
//		List<Integer> listB = new ArrayList<>(setB);
//		
//		Collections.sort(listA); // ����
//		Collections.sort(listB);
//		
//		for(int i = 0 ;i < listA.size();i++) {  // ���� ������ ��
//			if ( listB.indexOf(listA.get(i)) != -1) {
//				result = listA.get(i);
//				break;
//			}
//		}
//	
//		return result;
//		
//	}
	
public static int solution3(int[] arrA, int[] arrB) {
		
		int indexA=0;
		int indexB=0;
		int result = -1;
		Arrays.sort(arrA); // �����ź��� ���Ϸ��� ����
		Arrays.sort(arrB);
		while(indexA < arrA.length && indexB <arrB.length) { //���� ������ �� �� ���� ��
			if(arrA[indexA] < arrB[indexB]) {
				indexA++;
			}else if((arrA[indexA] > arrB[indexB])) {
				indexB++;
			}else {
				result = arrA[indexA];
				break;
			}
		}		
		return result;
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
