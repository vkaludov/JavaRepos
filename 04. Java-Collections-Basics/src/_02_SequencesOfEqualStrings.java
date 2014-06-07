import java.util.Scanner;

public class _02_SequencesOfEqualStrings {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String words = input.nextLine();

		String[] inputAsArray = words.split("[ ]+");
		
		System.out.print(inputAsArray[0] + " ");
		
		for (int i = 1; i < inputAsArray.length; i++) {			
			
			if (inputAsArray[i].equals(inputAsArray[i - 1])) {
				System.out.print(inputAsArray[i] + " ");
			}
			else {
				System.out.println();
				System.out.print(inputAsArray[i] + " ");
			}
			
		}

	}

}
