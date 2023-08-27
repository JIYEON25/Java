package jy.java.Exam12;

/**
 * OuterEx.java / javac OuterEx.java / java OuterEx 에러
 * java OuterEx$InnerEx
 */
public class OuterEx {
	public static class InnerEx {
		static int x = 10;
	}
	
	public static void main(String[] args) {
		OuterEx.InnerEx ei = new OuterEx.InnerEx();
		System.out.println("ei.x : " + ei.x);
		System.out.println("ei.x : " + OuterEx.InnerEx.x);
	}
}
