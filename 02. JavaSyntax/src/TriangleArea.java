import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstX = sc.nextInt();
		int firstY = sc.nextInt();
		int secondX = sc.nextInt();
		int secondY = sc.nextInt();
		int thirdX = sc.nextInt();
		int thirdY = sc.nextInt();		
		int area = Math.abs(firstX * (secondY - thirdY) + secondX * (thirdY - firstY)
				+ thirdX * (firstY - secondY));
		System.out.println(area / 2);
	}
}
