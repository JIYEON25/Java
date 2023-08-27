package jy.java.exam11;

public class MyClassEx {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass("피카츄");
		MyClass mc3 = new MyClass("꼬부기", 46);
		MyClass mc4 = new MyClass(12, "이상해씨");
		System.out.println(mc1.getName() + ", " +  mc1.getAge());
		System.out.println(mc2.getName() + ", " +  mc2.getAge());
		System.out.println(mc3.getName() + ", " +  mc3.getAge());
		System.out.println(mc4.getName() + ", " +  mc4.getAge());
		
	
	
	}
}
