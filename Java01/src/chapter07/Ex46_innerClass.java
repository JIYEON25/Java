package chapter07;

public class Ex46_innerClass {
	
	class InstanceInner {
		int iv = 100;
//		static int cv = 100;		// 내부클래스 static 선언 불가
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;				//static 변수 선언 불가
			final static int CONST = 300;		//final static 은 상수라서 가능
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
