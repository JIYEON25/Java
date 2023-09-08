package chapter06;

class MyMath2 {
	long a, b;
	
	long add() {
		return a + b;			//인스턴스 변수
	}
	
	long subtract() {
		return a - b;
	}
	
	long multiply() {
		return a * b;
	}
	
	double divide() {
		return a / b;
	}
	
	static long add(long a, long b) {
		return a + b;			//지역변수
	}
	
	static long subtract(long a, long b) {
		return a - b;
	}
	
	static long multiply(long a, long b) {
		return a * b;
	}
	
	static double divide(long a, long b) {
		return a / (double) b;
	}
}

public class Ex27_method02 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		System.out.println();
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
