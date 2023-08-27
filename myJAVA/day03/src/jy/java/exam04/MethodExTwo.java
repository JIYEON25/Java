package jy.java.exam04;

public class MethodExTwo {
	int var1, var2; //멤버 변수들
	
	public int sum(int a, int b) { // 메소드(멤버함수)
		return a + b;
	}
	
	
	public static void main(String[] args) {
		MethodExTwo me = new MethodExTwo();
		int res = me.sum(1000, -10);
		System.out.println("res = " + res);
	}
}
