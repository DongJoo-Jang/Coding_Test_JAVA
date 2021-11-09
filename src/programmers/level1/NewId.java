package programmers.level1;

public class NewId {

	
	public static void main(String[] args) {
		String new_id = "=.=";
		
		//char[] test = new_id.toCharArray();
		//System.out.println(test);
		solution(new_id);
		
	}
	
	
	
	
	
	 public static  String solution(String new_id) {
		 char[] permitCharacter = {'-','_','.'};
		 String answer = "";
		 boolean bPermit = false;
		 boolean bSequenceDot = false;
		 answer = new_id.toLowerCase();
		 
		 char[] arrayNewId = answer.toCharArray(); // 1단계 
		 for(int i = 0  ; i <arrayNewId.length;i++){ //2~3단계
			 bPermit= false;
			 if(arrayNewId[i] >=48 && arrayNewId[i] <= 57 ) {
				 bSequenceDot = false;
				 continue;
			 }
			 if(arrayNewId[i] >=97 && arrayNewId[i] <= 122 ) {
				 bSequenceDot = false;
				 continue;
			 }
			 for(int y = 0;y < permitCharacter.length;y++) {
				 if(arrayNewId[i] == permitCharacter[y]) {
					 bPermit = true;
					 if(y == 2) {
						if(bSequenceDot == true) {
							arrayNewId[i] = ' ';
						}
						 bSequenceDot = true;
					 }else {
						 bSequenceDot = false;
					 }
					 break;
				 }
			 }
			 if(bPermit) {
				 continue;
			 }else {
				 arrayNewId[i] = ' ';
			 }
		 }
		 answer = String.valueOf(arrayNewId);
		 answer = answer.replace(" ", "");
		 arrayNewId = answer.toCharArray();
		 /////////////////////////////////////////////////
		 if(answer.length() > 0) {
		 arrayNewId = answer.toCharArray(); //4단계
		 
		 if(arrayNewId[0] =='.')
			 arrayNewId[0] =' ';
		 if(arrayNewId[(arrayNewId.length)-1] =='.')
			 arrayNewId[arrayNewId.length-1] = ' ';
		 answer = String.valueOf(arrayNewId);
		 answer = answer.replace(" ", "");
		 arrayNewId = answer.toCharArray();
		 }
		 ///////////////////////////////////////////////////
		 if(answer.equals("")) { // 5단계
			 answer+='a';
		 }
		 //////////////////////////////////////////////////
		 if(answer.length()>15){ // 6단계
			answer = answer.substring(0,15); 
			arrayNewId = answer.toCharArray();
		 if(arrayNewId[(arrayNewId.length)-1] =='.')
			 arrayNewId[arrayNewId.length-1] = ' ';
			 
		 answer = String.valueOf(arrayNewId);
		 answer = answer.replace(" ", "");
		 arrayNewId = answer.toCharArray();
		 }
		 ////////////////////////////////////////////////////
		 while(answer.length()<3) {
			 answer += answer.charAt(answer.length()-1);
		 }
		 

		 System.out.println(answer);
		 
	        return answer;
	    }
	
}
