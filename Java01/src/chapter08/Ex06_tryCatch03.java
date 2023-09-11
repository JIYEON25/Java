package chapter08;

public class Ex06_tryCatch03 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception e) {				//모든 예외는 Exception의 자손이기 때문에 실행 됨.
			System.out.println(5);
		}
		System.out.println(6);
	}
}
