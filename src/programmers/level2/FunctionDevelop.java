package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelop  {
	
	
	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] result ;
		result = FunctionDevelop.solution(progresses,speeds);
		for(int re : result)
			System.out.println(re);
	}
	
	
	
	
	
	
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		
		List<Integer> jobList = new ArrayList<>();
		List<Integer> speedList = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>();
		for(int i = 0 ; i < speeds.length; i++) {
			jobList.add(progresses[i]);
			speedList.add(speeds[i]);
		}
		
		while(!jobList.isEmpty()) {
			
			int completeCnt =  0;
			for(int i = 0 ; i < jobList.size(); i++) {
				jobList.set(i, jobList.get(i)+speedList.get(i));
			}
			
			for(int i = 0 ; i < jobList.size(); i++) {
				if(jobList.get(i) >= 100) {
					completeCnt++;
				}
				else {
					break;
				}
			}
			if(completeCnt > 0)
			resultList.add(completeCnt);
			for(int i = 0 ; i <completeCnt; i++) {
				jobList.remove(0);
				speedList.remove(0);
			}
			
		}
		answer =  new int[ resultList.size()];
		for(int i = 0 ; i < resultList.size(); i++) {
			answer[i] =  resultList.get(i);
		}
				
		
		
        return answer;
    }
}
