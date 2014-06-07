import java.util.Locale;
import java.util.Scanner;

public class PointsInsideAFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT); // so that it can recognize both . and ,
		                                // by the input !
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) {
			System.out.println("Inside");
		}
		else if (x >= 12.5 && x <= 17.5 &&y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		}
		else if (x >= 20 && x <= 22.5 &&y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
