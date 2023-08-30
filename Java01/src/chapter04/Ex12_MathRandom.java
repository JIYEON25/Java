package chapter04;

public class Ex12_MathRandom {

	public static void main(String[] args) {
		int num = 0;
		
		for(int i=0; i<5; i++) {
			num = (int)(Math.random() * 6) + 1;
			System.out.print(num + " ");
		}
	}

}
