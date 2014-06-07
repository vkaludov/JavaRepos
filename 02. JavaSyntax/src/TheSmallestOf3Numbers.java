import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class TheSmallestOf3Numbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);		
		DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if (a <= b && a <= c) {
			System.out.println(format.format(a));
		}
		else if (b <= a && b <= c) {
			System.out.println(format.format(b));
		}
		else if (c <= a && c <= b) {
			System.out.println(format.format(c));
		}
	}
}
