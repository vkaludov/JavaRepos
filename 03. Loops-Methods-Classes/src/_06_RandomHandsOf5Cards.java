import java.util.Random;
import java.util.Scanner;


public class _06_RandomHandsOf5Cards {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int hands = sc.nextInt();
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" ,"A"};
		char[] suits = {'♣', '♦', '♥', '♠'};
		
		for (int i = 0; i < hands; i++) {
			for (int j = 0; j < 5; j++) {
				int randomCard = random.nextInt(cards.length - 1) + 1;
				int randomSuit = random.nextInt(suits.length - 1) + 1;
				if (j == 4) {
					System.out.print(cards[randomCard] + "" + suits[randomSuit]);
				}else {
					System.out.print(cards[randomCard] + "" + suits[randomSuit] + " ");
				}				
			}System.out.println();
		}
	}

}
