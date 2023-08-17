package chapter02;

public class Ex06_LiteralType {

	public static void main(String[] args) {
		int octNum = 010;				// 8진수 10, 10진수로 8
		int hexNum = 0x10;				// 16진수 10, 10진수로 16
		System.out.println(octNum);
		System.out.println(hexNum);
		
		long big = 100_000_000_000L;	// _ 구분자
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		System.out.println(big);
		System.out.println(hex);
		
		float pi = 3.14f;				// F도 사용가능, 생략불가
		double rate = 1.618d;			// D도 사용가능, 생략가능
		System.out.println(pi);
		System.out.println(rate);
		
	}

}
