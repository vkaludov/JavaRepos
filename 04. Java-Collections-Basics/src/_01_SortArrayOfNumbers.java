import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.nextLine();
		int[] arrOfNums = new int[number];

		for (int i = 0; i < number; i++) {
			arrOfNums[i] = input.nextInt();
		}
		Arrays.sort(arrOfNums);

		for (int i = 0; i < arrOfNums.length; i++) {
			System.out.print(arrOfNums[i] + " ");
		}
	}
}
