package backjoon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quiz4673 {
	public static void main(String[] args) {
		findSelfNum();
	}

	public static void findSelfNum() {
		Set<Integer> numberSet = new HashSet<>();
		List<Integer> selfNumList = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			int sum = 0;
			int temp = i;
			while (temp >= 10) {
				sum += temp % 10;
				temp = temp / 10;
				if (temp < 10) {
					break;
				}
			}
			sum += temp;
			numberSet.add(i + sum);
		}

		for (int i = 1; i <= 10000; i++) {
			if (!numberSet.contains(i)) {
				selfNumList.add(i);
			}
		}
		for(Integer num :selfNumList ) {
			System.out.println(num);
		}

	}
}
