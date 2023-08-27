package jy.java.Exam08;

class OuterEx {
	public class InnerEx {
		int x = 5;
	}
}

public class InnerExOne {
	public static void main(String[] args) {
		OuterEx eo = new OuterEx();
		
		OuterEx.InnerEx ei = eo.new InnerEx();
		System.out.println("ei.x = " + ei.x);
	}
}
