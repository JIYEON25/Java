package chapter07;

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
	
}
interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {

	@Override
	public void method1() {
		System.out.println("method1() in Child3");
	}
	
}
public class Ex41_default_static {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}

}
