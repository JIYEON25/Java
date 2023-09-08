package chapter07;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {

	void method() {
		System.out.println("x = " +  x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Ex10_super02 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method();
	}

}
