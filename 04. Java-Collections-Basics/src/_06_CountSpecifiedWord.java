import java.util.Scanner;


public class _06_CountSpecifiedWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] words = text.split("\\W+");
		String targetWord = sc.nextLine();
		int counter = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(targetWord)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
