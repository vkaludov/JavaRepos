import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		System.out.println(Math.abs(firstNum + secondNum));
	}
}
