package jy.java.Exam11;

public class StaticInner {
	int a = 10;
	private int b = 100;
	static int c = 200;
	static class Inner {
		static int d = 1000;
		public void printData() {
//			System.out.println("int a : "+ a); //오류
//			System.out.println("private int b : "+ b); //오류
			System.out.println("static int c : " + c);
		}
	}
	
	public static void main(String[] args) {
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();
	}
}
