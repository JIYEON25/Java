package chapter08;

public class Ex06_tryCatch04 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");			//ArithmeticException을 제외한 모든 예외 처리
		}												//그래서 출력되지 않음.
		System.out.println(6);
	}
}
