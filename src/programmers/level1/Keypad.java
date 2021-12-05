package programmers.level1;

public class Keypad {
	 
	public static void main(String[] args) {
		int[] numbers= {1,3,4,5,8,2,1,4,5,9,5};
		int[] numbers2= {7,0,8,2,8,3,1,5,7,6,2};
		System.out.println(solution(numbers2, "left"));
	}
	
	
	public static String solution(int[] numbers, String hand) {    
		String answer = "";     
		int [][] keyTable = { 	 {1,2,3}
								,{4,5,6} 
								,{7,8,9}
								,{100,0,200}
								};
		int curLeft = 100;
		int curRight = 200;
		
		for(int i =0; i<numbers.length;i++) {
			int leftX =0;
			int leftY =0;
			int rightX =0;
			int rightY =0;
			int targetX = 0;
			int targetY = 0;
			int distanceLeft = 0;
			int distanceRight = 0;
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				curLeft = numbers[i];
			}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				curRight = numbers[i];
			}else {
				for(int x =0; x<4;x++) {
					for(int y =0; y<3;y++) {
						if(curLeft == keyTable[x][y]) {
							leftX= x;
							leftY = y;
						}
						if(curRight == keyTable[x][y]) {
							rightX= x;
							rightY = y;
						}
						if(numbers[i] == keyTable[x][y]) {
							targetX= x;
							targetY = y;
						}
					}
				}
				distanceLeft = Math.abs(targetX-leftX) + Math.abs(targetY-leftY);
				distanceRight = Math.abs(targetX-rightX) + Math.abs(targetY-rightY);
				if(distanceLeft > distanceRight) {
					answer += "R";
					curRight = numbers[i];
				}else if(distanceLeft < distanceRight) {
					answer += "L";
					curLeft = numbers[i];
				}else {
					if(hand.equals("right")){
						answer += "R";
						curRight = numbers[i];
					}
					else if(hand.equals("left")) {
						answer += "L";
						curLeft = numbers[i];
					}
				}
			}
		}

	        return answer;
	    }
	
}
