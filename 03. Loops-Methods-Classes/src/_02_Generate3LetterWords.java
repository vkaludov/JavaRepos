import java.util.Scanner;

public class _02_Generate3LetterWords {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] letters = input.toCharArray();
		
		for (int first = 0; first < letters.length; first++) {
			for (int second = 0; second < letters.length; second++) {
				for (int third = 0; third < letters.length; third++) {
					System.out.printf("%s%s%s ",letters[first],letters[second],letters[third]);
				}
			}
		}
		
	}
}
