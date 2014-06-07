import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] text = sc.nextLine().toLowerCase().split("\\W+");

		Map<String, Integer> words = new TreeMap<String, Integer>();
		int maxCount = 0;
		for (String word : text) {
			Integer count = words.get(word);
			if (count == null) {
				count = 0;
			}
			if (count + 1 > maxCount) {
				maxCount = count + 1;
			}
			words.put(word, count + 1);
		}

		for (Map.Entry<String, Integer> max : words.entrySet()) {
			if (max.getValue() == maxCount) {
				System.out.printf("%s -> %d times\n", max.getKey(),
						max.getValue());
			}
		}

	}

}
