package jy.java.Exam04;

abstract class AbsEx01 {
	int a = 100; //변수
	final String str = "abstract test"; // 상수
	public String getStr() {
		return str;
	}
	
	abstract public int getA();
}

abstract class AbsEx02 extends AbsEx01 {
	public int getA() {
		return a;
	}
	public abstract String getStr();
}

public class AbsEx extends AbsEx02 {
	public String getStr() {
		return str;
	}
	public static void main(String[] args) {
		AbsEx ae = new AbsEx();
		System.out.println("ae.getA() : " + ae.getA());
		System.out.println("ae.getStr() : " + ae.getStr());
	}
	
}


