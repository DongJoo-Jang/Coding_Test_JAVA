package programmers;

public class Maraton {
	public static void main(String[] args) {
		
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		String[] participant2 = {"marina","josipa","nikola","vinko","filipa"};
		String[] completion2 = {"marina","josipa","nikola","filipa"};
		System.out.println(solution(participant2,completion2));
	}
	
	
	
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		for(int i = 0  ; i<participant.length;i++) {
			boolean bFind = false;
			for(int y = 0 ; y< completion.length;y++) {
					if(participant[i].equals(completion[y])) {
						bFind = true;
						completion[y]=null;
						break;
					}
			}
			if(!bFind )
				answer = participant[i];
				
        	
        }
		
		
        return answer;
    }
}
