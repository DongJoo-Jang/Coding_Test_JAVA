package programmers;

public class Lotto {

	
	public static void main(String[] args) {
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		int[] result = solution(lottos,win_nums);
		
		System.out.println(result[0]+","+result[1]);
	}
	
    public static int[] solution(int[] lottos, int[] win_nums) {
    
        int maxRank = 0;
        int minRank = 0;
        int zeroCount = 0;
        int matchCount = 0;
        int[] Rank = {6,6,5,4,3,2,1};
        int i ,j;
        
        for(i=0;i<lottos.length;i++) {
        	if(lottos[i] == 0) 
        	{
        		zeroCount ++;	
        	}
        	else 
        	{
        		for(j=0;j<win_nums.length;j++) {
        			if(lottos[i] == win_nums[j])
        				matchCount ++;
        		}
        	}
        }
        maxRank =Rank[matchCount+zeroCount];
        minRank =Rank[matchCount];
        int[] answer = {maxRank,minRank};
        return answer;
    }
}
