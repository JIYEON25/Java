package jy.java.Exam01;

class Super {
	void aaa() {
		System.out.println("aaa");
	}
	void bbb() {
		System.out.println("bbb");
	}
}

class Sub extends Super {
	@Override
	void aaa() {
		System.out.println("override method");
	}
	void ccc() {
		System.out.println("ccc");
	}
}

public class PolimorphismTest {
	public static void main(String[] args) {
		Super ss = new Super();
		ss.aaa();
		ss.bbb();
		System.out.println();
		
		Sub s = new Sub();
		s.aaa();
		s.ccc();
		s.bbb();
		
		Super sss = new Sub();
		sss.aaa();
		sss.bbb();
//		sss.ccc();	// 사용불가
		
		
	}
}
