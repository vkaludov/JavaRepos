import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] words = text.split("\\W+");
		System.out.println(words.length);
	}

}
