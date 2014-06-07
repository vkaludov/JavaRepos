import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] text = sc.nextLine().toLowerCase().split("\\W+");
		Set<String> words = new TreeSet<>();
		for (String word : text) {
			words.add(word);
		}
		for (String word : words) {
			System.out.print(word + " ");
		}

	}

}
