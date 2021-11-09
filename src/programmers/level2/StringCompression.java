package programmers.level2;

import java.util.ArrayList;

public class StringCompression {

	public static void main(String[] args) {
		String test = "aabbaccc";
		String test2 = "ababcdcdababcdcd";
		String test3 = "abcabcdede";
		String test4 = "c";
		System.out.println(solution(test4));
	}

	public static int solution(String s) {

		String result = "";
		int minLength = 1000;
		for (int cutCnt = 1; cutCnt < s.length(); cutCnt++) {
			String temp = s;
			int sameCount = 1;
			int cmpCnt = temp.length() / cutCnt;
			int mod = temp.length() % cutCnt;
			result = "";
			while (cmpCnt > 0) {

				String piece = temp.substring(0, cutCnt);
				if (temp.length() > cutCnt) {
					temp = temp.substring(cutCnt);
					if(temp.length() < cutCnt) {
						if (sameCount > 1) 
							result += sameCount;						
						
						result += piece;
						sameCount = 1;

					}else if (piece.equals(temp.substring(0, cutCnt))) {
						sameCount++;
					} else {
						if (sameCount > 1) 
							result += sameCount;						
						
						result += piece;
						sameCount = 1;

					}
				}else {
						if (sameCount > 1) 
							result += sameCount;
						result += piece;
						sameCount = 1;
				}
				cmpCnt--;
			}
			if (mod != 0) {
				result += temp;
			}
			if (result.length() < minLength)
				minLength = result.length();

		}
		if(minLength == 1000) {
			minLength = s.length();
		}
		int answer = minLength;
		return answer;
	}
}
