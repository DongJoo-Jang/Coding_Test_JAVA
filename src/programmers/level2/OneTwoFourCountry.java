package programmers.level2;


public class OneTwoFourCountry {

	public static void main(String[] args) {
		System.out.println(solution(40));
	}

	public static String solution(int n) {

		int[] chart = { 1, 2, 4 };
		String result = "";
		String answer = "";
		int[] array = new int[3000];

		while (n > 0) {
			boolean bUp = false;
			if (array[0] == 0)
				array[0] = chart[0];
			else if (array[0] == chart[0])
				array[0] = chart[1];
			else if (array[0] == chart[1])
				array[0] = chart[2];
			else if (array[0] == chart[2]) {
				bUp = true;
				array[0] = chart[0];
				
			}

			
				for (int i = 1; i < array.length; i++) {
			
					if (bUp) {
						bUp = false;
						if (array[i] == 0)
							array[i] = chart[0];
						else if (array[i] == chart[0])
							array[i] = chart[1];
						else if (array[i] == chart[1])
							array[i] = chart[2];
						else if (array[i] == chart[2]) {
							bUp = true;
							array[i] = chart[0];
						}
					}else
						break;
				}
			n--;
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0 )
				break;
			result+= array[i];
		
		}
	StringBuffer strBuf = new StringBuffer(result);
	result=strBuf.reverse().toString();
	int resultInt = Integer.parseInt(result);
	answer = Integer.toString(resultInt);
	

	return answer;
}

}
