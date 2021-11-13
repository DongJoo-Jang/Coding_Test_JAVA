package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OpenChatting {
	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		String[] answer = solution(record);
		for (int x = 0; x < answer.length; x++)
			System.out.println(answer[x]);
	}

	public static String[] solution(String[] record) {
		HashMap<String, String> idMap = new HashMap<String, String>();
		List<String> decodingList = new ArrayList<>();
		for (int i = 0; i < record.length; i++) {
			String[] arraySplit = record[i].split(" ");
			if (arraySplit[0].equals("Enter") || arraySplit[0].equals("Change")) {
				idMap.put(arraySplit[1], arraySplit[2]);
			}
		}
		for (int i = 0; i < record.length; i++) {
			String[] arraySplit = record[i].split(" ");
			if (arraySplit[0].equals("Enter") ) {
				decodingList.add(idMap.get(arraySplit[1])+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù." );
			}else if(arraySplit[0].equals("Leave") ) {
				decodingList.add(idMap.get(arraySplit[1])+"´ÔÀÌ ³ª°¬½À´Ï´Ù." );
			}
		}
		String[] answer =  new String[decodingList.size()];
		decodingList.toArray(answer);

		return answer;
	}

}
