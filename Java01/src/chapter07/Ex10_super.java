package chapter07;

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("x = " +  x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Ex10_super {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
