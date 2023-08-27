package jy.java.Exam06;

interface Inter1 {
	public int getA();
}

interface Inter2 {
	public int getA();
}

interface Inter3 extends Inter1, Inter2 {
	public int getData();
}

public class InterEx02 implements Inter3{
	int a = 100;
	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a+10;
	}
	
	public static void main(String[] args) {
		InterEx02 it = new InterEx02();
		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
		
	}
}
