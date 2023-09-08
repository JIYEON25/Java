package chapter06;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	// 
}

public class Ex13_vairable {

	public static void main(String[] args) {
		System.out.println("Card.width " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1 is " + c1.kind + ", c1's number is " 
							+ c1.number + ", size of c1 is " + c1.width + ", " + c1.height);
		System.out.println("c2 is " + c2.kind + ", c2's number is " 
							+ c2.number + ", size of c2 is " + c2.width + ", " + c2.height);
		
		System.out.println("Let's change the size of c1.");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1 is " + c1.kind + ", c1's number is " 
							+ c1.number + ", size of c1 is " + c1.width + ", " + c1.height);
		System.out.println("c2 is " + c2.kind + ", c2's number is " 
							+ c2.number + ", size of c2 is " + c2.width + ", " + c2.height);
		
	}

}
