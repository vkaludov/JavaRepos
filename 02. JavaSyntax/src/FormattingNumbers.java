import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
        
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		String aBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		if (c%1 == 0) {
		System.out.printf("|%-10X|%10s|%10.2f|%-10.0f|", a, aBinary, b, c );
		}
		else {
			System.out.printf("|%-10X|%10s|%10.2f|%-10.3f|", a, aBinary, b, c );
		}
	}
}
