package chapter07;

public class Ex47_innerClass02 {
	
	class InstanceInner { }
	static class StaticInner { }
	
	//인스턴스멤버 간에는 서로 직접 접근 가능
	InstanceInner iv = new InstanceInner();
	//static멤버 간에는 서로 직접 접근 가능	
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();		//static멤버는 인스턴스멤버로 직접 접근 안됨.
		StaticInner obj2 = new StaticInner();
		
		//굳이 하려면...외부클래스 생성 후 접근
		Ex47_innerClass02 outer = new Ex47_innerClass02();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();		//instance메서드에선 다 됨~~
		StaticInner obj2 = new StaticInner();
		
		//메서드 내에서 선언된 내부 클래스는 외부에서 접근 불가
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner { }
		LocalInner lv = new LocalInner();
	}
	public static void main(String[] args) {
		
	}

}
