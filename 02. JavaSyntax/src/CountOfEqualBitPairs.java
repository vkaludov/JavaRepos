import java.util.Scanner;

public class CountOfEqualBitPairs {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();		
		int count = 0;		
		String numToBinary = String.format(Integer.toBinaryString(number));		
	
		for (int i = 1; i <= numToBinary.length(); i++) {
			
			int firstBit = number & 1;
			number >>= 1;
			int nextBit = number & 1;
			if (nextBit == firstBit) {
				count++;
			}			
		}System.out.println(count);		
		
		/* Vtori variant na reshenie:
		 
//		char[] bits = numToBinary.toCharArray();
//		
//		for (int i = 0; i < numToBinary.length() - 1; i++) {
//			if (bits[i] == bits[i + 1]) {
//				count++;
//			}
//		}System.out.println(count);	
*/	
	}
}
