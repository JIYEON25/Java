package jy.java.exam09;

public class ExceptionEx08 {
	private static void test() throws Exception {
		System.out.println(6 / 0);
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
}
