import java.util.Scanner;


public class CountOfBitsOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int bitsCounter = Integer.bitCount(number);
		
		// Second way to solve the problem:
//		int count = 0;
//		
//		for (int i = 0; i < 32; i++) {
//			
//			int bit = number & 1;
//			if (bit == 1) {
//				count++;
//			}
//			number >>= 1;
//		}System.out.println(count);
		System.out.println(bitsCounter);
	}
}
