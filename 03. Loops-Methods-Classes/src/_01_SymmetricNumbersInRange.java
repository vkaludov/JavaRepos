import java.util.Scanner;

public class _01_SymmetricNumbersInRange {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		
		for (int i = start; i <= end; i++) {	
			
// We convert i to String so that we can compare the first digit to the last one. If they
// are the same, than the number is symmetric
			String digits = Integer.toString(i);
			if (digits.charAt(0) == digits.charAt(digits.length() - 1)) {
					System.out.print(i + " ");
			}
		}
	}
}
