package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoreSpicy {

	public static void main(String[] args) {
		int[] test = {1,2,3,9,10,12};
		System.out.println(solution(test,7));
	}
	
	public static int solution(int[] scoville, int K) {
		Integer firstLow = 0;
		Integer secondLow = 0;
		Integer newValue = 0;
		int count = 0;
		List<Integer> scovilleList = new ArrayList<>();
		for (int item : scoville) {
			scovilleList.add(item);
		}
		int min  = Collections.min(scovilleList);
		while (min < K) {
			firstLow = Collections.min(scovilleList);
			scovilleList.remove(firstLow);
			if(scovilleList.isEmpty()) {
				count = -1;
				break;
			}
			
			secondLow = Collections.min(scovilleList);
			scovilleList.remove(secondLow);
			newValue = firstLow + secondLow * 2;
			scovilleList.add(newValue); 
			count++;
			min  = Collections.min(scovilleList);
		}

		int answer = count;
		return answer;
	}

}
