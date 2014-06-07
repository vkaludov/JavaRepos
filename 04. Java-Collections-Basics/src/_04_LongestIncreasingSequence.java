import java.util.Scanner;

public class _04_LongestIncreasingSequence {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputAsStr = sc.nextLine();
		String[] inputAsArr = inputAsStr.split(" ");
		int[] numbers = new int[inputAsArr.length];

		for (int i = 0; i < inputAsArr.length; i++) {
			numbers[i] = Integer.parseInt(inputAsArr[i]);
		}

		int counterTemp = 1;
		int counter = 1;
		int positionOfInt = 0;

		System.out.print(numbers[0]);

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				System.out.print(" " + numbers[i]);
				counterTemp++;
			} else {
				counterTemp = 1;
				System.out.println();
				System.out.print(numbers[i]);
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionOfInt = i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(numbers[positionOfInt - counter + 1 + j] + " ");
		}
		System.out.println(numbers[positionOfInt]);
	}

}
