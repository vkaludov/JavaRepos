import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class _07_DaysBetweenTwoDates {
	public static void main(String[] args) {

		/*
		 * Importing Joda Time from:
		 * http://sourceforge.net/projects/joda-time/files/joda-time/
		 */

		Scanner sc = new Scanner(System.in);
		String startDate = sc.nextLine();
		String endDate = sc.nextLine();

		String[] startDateToArr = startDate.split("-");
		String[] endDateToArr = endDate.split("-");

		DateTime first = new DateTime(Integer.parseInt(startDateToArr[2]),
				Integer.parseInt(startDateToArr[1]),
				Integer.parseInt(startDateToArr[0]), 0, 0);
		DateTime end = new DateTime(Integer.parseInt(endDateToArr[2]),
				Integer.parseInt(endDateToArr[1]),
				Integer.parseInt(endDateToArr[0]), 0, 0);

		int days = Days.daysBetween(first, end).getDays();
		System.out.println(days);
	}

}
