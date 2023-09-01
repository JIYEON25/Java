package jy.java.exam03;

public class ExceptionEx02 {
	public static void main(String[] args) {
		int number = 50;
		int result = 0;
		for(int i=0; i<10; i++) {
			try {
			result = number / (int)(Math.random()*5);
			System.out.println(result);
			}catch (ArithmeticException e) {
				System.out.println("Exception 발생");
			}
		}// end for
	}
}
