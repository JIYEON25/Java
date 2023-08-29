package chapter03;

public class Ex11_MathRound {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;	// 소수점 세자리
		System.out.println(shortPi);
	}

}
