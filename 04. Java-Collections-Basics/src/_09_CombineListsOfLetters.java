import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Character> firstList = new ArrayList<>();
		ArrayList<Character> secondList = new ArrayList<>();

		for (char letter : sc.nextLine().replaceAll("\\s+", "").toCharArray()) {
			firstList.add(letter);
		}
		for (char letter : sc.nextLine().replaceAll("\\s+", "").toCharArray()) {
			secondList.add(letter);
		}
		secondList.removeAll(firstList);
        
		firstList.addAll(secondList);
        
		for (int i = 0; i < firstList.size(); i++) {
			if (i == firstList.size() - 1) {
				System.out.print(firstList.get(i));
			}else {
				System.out.print(firstList.get(i) + " ");
			}			
		}

	}

}
