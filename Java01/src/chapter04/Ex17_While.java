package chapter04;

public class Ex17_While {

	public static void main(String[] args) {
		int i = 5;
		
		while(i-- != 0) {
			System.out.println(i + " - I can do it.");
		}
		System.out.println();
		
		/**
		 * 1 ~ ?? <= 100
		 */
		int sum = 0;
		int j = 0;
		while(sum <= 100) {
			System.out.printf("%d - %d%n", j, sum);
			sum += ++j;
		}
	}

}
