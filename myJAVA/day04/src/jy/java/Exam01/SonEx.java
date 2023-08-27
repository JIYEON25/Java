package jy.java.Exam01;

class ParentEx {
	int foo = 5;
	public int getNumber(int a) {
		return a+1;
	}
}

public class SonEx extends ParentEx {
	int foo = 7;
	public int getNumber(int a) {
		return a+2;
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
}
