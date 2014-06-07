import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String[] arr = new String[number];
		
		sc.nextLine();		
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextLine();
		}
		Arrays.sort(arr);
		for(int i = 0; i < number; i++) {
                System.out.println(arr[i]);
        }
	}
}