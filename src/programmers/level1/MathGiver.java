package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class MathGiver {
		
	public static void main(String[] args) {
		int[] caseOne = {1,2,3,4,5};
		int[] caseTwo = {1,3,2,4,2};
		int[] answer = solution(caseTwo);
	
		for(int i = 0 ; i < answer.length;i++) {
			System.out.println( answer[i]);	
		}
		
	}
	
	public static  int[] solution(int[] answers) {
        
		int[] answer = null;
        int[] userOne = {1,2,3,4,5};
        int[] userTwo = {2,1,2,3,2,4,2,5};
        int[] userThree = { 3,3,1,1,2,2,4,4,5,5};
        int[] correctCnt= {0,0,0};
        List<Integer> lists =new ArrayList<>();
        
        int indexOne=0,indexTwo=0,indexThree=0;
        for(int i =0 ; i<answers.length;i++) {
        	
        	
        	if(indexOne == userOne.length)
        		indexOne=0;
        	if(indexTwo == userTwo.length)
        		indexTwo=0;
        	if(indexThree == userThree.length)
        		indexThree=0;
        	
        	if(answers[i] == userOne[indexOne])
        		correctCnt[0]++;
        	if(answers[i] == userTwo[indexTwo])
        		correctCnt[1]++;
        	if(answers[i] == userThree[indexThree])
        		correctCnt[2]++;

        	indexOne++;
        	indexTwo++;
        	indexThree++;
        }
        int maxVal = 0;
        for(int y = 0 ; y< correctCnt.length; y++) {
        	if (correctCnt[y] > maxVal)
        		maxVal = correctCnt[y];
        }
        for(int y = 0 ; y< correctCnt.length; y++) {
        	
        	if(maxVal == correctCnt[y]) {
        		lists.add(y+1);
        	}

        }
        
        answer =new int[lists.size()];
        for(int i = 0; i<lists.size();i++) {
        	answer[i] = lists.get(i);
        }
        
        
        
        
        return answer;
    }
	
}
