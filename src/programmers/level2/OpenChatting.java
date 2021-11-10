package programmers.level2;

import java.util.HashMap;
import java.util.Set;

public class OpenChatting {
	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		String[] answer = solution(record);
		for (int x = 0; x < answer.length; x++)
			System.out.println(answer[x]);
	}

	public static String[] solution(String[] record) {

		String result = "";
		HashMap<String, String> idMap = new HashMap<String, String>();
		for (int i = 0; i < record.length; i++) {
			String[] arraySplit = record[i].split(" ");
			if(arraySplit[1].length() < 1  && arraySplit[1].length()>10) {
				continue;
			}
			if (arraySplit[0].equals("Enter")) {
				idMap.put(arraySplit[1], arraySplit[2]);
				result += arraySplit[1] + " /Enter ";
			} else if (arraySplit[0].equals("Leave")) {
				result += arraySplit[1] + " /Leave ";
			} else if (arraySplit[0].equals("Change")) {
				idMap.put(arraySplit[1], arraySplit[2]);
			}
		}
		String[] resultSplit = result.split(" ");
		Set<String> idSet = idMap.keySet();
		for(int i =0 ;i< resultSplit.length;i++) {
			for (String id : idSet) {
				if(resultSplit[i].equals(id)){
					resultSplit[i]= idMap.get(id);
				}
			}
		}
		result = "";
		for(String piece : resultSplit)
			result += piece;
		result = result.replace("/Enter", "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
		result = result.replace("/Leave", "´ÔÀÌ ³ª°¬½À´Ï´Ù.");
		String[] answer = result.split("\\.");
		for (int y = 0; y < answer.length; y++) {
			answer[y] += ".";
		}
		return answer;
	}

}
