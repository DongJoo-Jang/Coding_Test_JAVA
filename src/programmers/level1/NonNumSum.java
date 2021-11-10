package programmers.level1;

public class NonNumSum {

	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,6,7,8,0};
		int[] numArray2 = {5,8,4,0,6,7,9};
		System.out.println( solution(numArray2));
	}
	
	
	public static int solution(int[] numbers) {
        int answer = 0;
        int [] numArray = {1,2,3,4,5,6,7,8,9};
        for(int i =0;i<numArray.length;i++) {
        	for(int y = 0 ; y<numbers.length ; y++) {
        		if (numArray[i] == numbers[y]) {
        			numArray[i] = 0 ;
        		break;
        		}
        	}
        }
        for(int i =0;i<numArray.length;i++) {
        	answer += numArray[i];
        }
        return answer;
    }
}
