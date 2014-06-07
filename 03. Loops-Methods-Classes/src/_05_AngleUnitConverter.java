import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.nextLine();

		double[] value = new double[number];
		String[] measure = new String[number];

		for (int i = 0; i < number; i++) {
			value[i] = input.nextDouble();
			measure[i] = input.next();
		}
		System.out.println();
		for (int i = 0; i < number; i++) {
			UnitConverter(value[i], measure[i]);
		}

	}
	
	private static void UnitConverter(double value, String measure){
		
		double result = 0;
		
		if (measure.equals("rad")) {
			result = Math.toDegrees(value);
			System.out.printf("%.6f deg\n", result);
		}else {
			result = Math.toRadians(value);
			System.out.printf("%.6f rad\n", result);
		}
		
	}
}
