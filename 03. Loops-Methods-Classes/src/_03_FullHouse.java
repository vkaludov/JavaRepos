public class _03_FullHouse {
	public static void main(String[] args) {
		
		int counter = 0;
		
		for (int firstCard = 2; firstCard <= 14; firstCard++) {
			for (int secondCard = 2; secondCard <= 14; secondCard++) {
				if (secondCard == firstCard) {
					continue;
				}
				for (int firstSuit = 1; firstSuit <= 4; firstSuit++) {
					for (int secondSuit = firstSuit + 1; secondSuit <= 4; secondSuit++) {
						for (int thirdSuit = secondSuit + 1; thirdSuit <= 4; thirdSuit++) {
							for (int fourthSuit = 1; fourthSuit <= 4; fourthSuit++) {
								for (int fifthSuit = fourthSuit + 1; fifthSuit <= 4; fifthSuit++) {
									System.out.print("(");
									printCard(firstCard);
                                    printSuit(firstSuit);
                                    System.out.print(" ");
                                    printCard(firstCard);
                                    printSuit(secondSuit);
                                    System.out.print(" ");
                                    printCard(firstCard);
                                    printSuit(thirdSuit);
                                    System.out.print(" ");
                                    printCard(secondCard);
                                    printSuit(fourthSuit);
                                    System.out.print(" ");
                                    printCard(secondCard);
                                    printSuit(fifthSuit);
                                    System.out.print(") ");
                                    counter++;
								}
							}
						}
					}
				}
			}
		}System.out.println();
		 System.out.println(counter + " full houses");
	}
	
	public static void printCard(int number) {
		
		if (number <= 10) {
			System.out.print(number);
		}else {
			switch (number) {
			case 11: System.out.print("J"); break;
			case 12: System.out.print("Q"); break;
			case 13: System.out.print("K"); break;
			case 14: System.out.print("A"); break;
			}
		}
	}
	
	public static void printSuit(int number) {
		
		char clubs = '♣';
        char diamonds = '♦';
        char hearts = '♥';
        char spades = '♠';
        
		switch (number) {
		case 1: System.out.print(clubs); break;
		case 2: System.out.print(diamonds); break;
		case 3: System.out.print(hearts); break;
		case 4: System.out.print(spades); break;
		}
	}
}
