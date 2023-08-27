package jy.java.exam01;

class MyClass{ //extends Object
	//String toString()
}

public class MyTest {
	public static void main(String[] args) {
		MyTest mc = new MyTest();
		System.out.println(mc);
		System.out.println(mc.hashCode());
		MyClass mc1 = new MyClass();
		System.out.println(mc1);
	}
}
