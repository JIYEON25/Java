package jy.java.exam04;

public class ExceptionEx03 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
	 try {
		 System.out.println(3);
		 System.out.println(4);
	 } catch (Exception e) {
		 System.out.println(5);
	 } // try-catch의 끝
	 System.out.println(6);
	}
}
