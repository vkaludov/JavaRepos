import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toLowerCase();
		String targetStr = sc.nextLine().toLowerCase();
		int counter = 0;
		
		for (int i = 0; i <= text.length() - targetStr.length(); i++) {
			if (text.substring(i, i + targetStr.length()).equals(targetStr)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
