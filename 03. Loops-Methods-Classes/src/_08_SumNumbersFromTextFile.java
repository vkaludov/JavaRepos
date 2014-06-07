import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _08_SumNumbersFromTextFile {
	public static void main(String[] args) {
		
		/*
		 * You have to manually enter the values in the Input.txt file 
		 * in the Loops-Methods-Classes.rar archive.
		 */

		int sum = 0;
		String line = "";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"Input.txt"));
			try {
				while ((line = reader.readLine()) != null) {
					sum += Integer.valueOf(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(sum);

		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}

	}

}
