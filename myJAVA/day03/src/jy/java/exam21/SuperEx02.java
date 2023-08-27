package jy.java.exam21;

class Super {
	public Super() {
		System.out.println("상위클래스의 기본생성자.");
	}
	public Super(int x) {
		System.out.println("상위클래스 생성자: " + x);
	}
}

class Sub extends Super { 
	public Sub() {
		super(5);
		System.out.println("하위클래스 생성자");
	}
}

public class SuperEx02 {
	public static void main(String[] args) {
		Sub sub = new Sub();
	}
}
