package chapter06;

public class Ex40_initialization {

	static {
		System.out.println("static { } ");	//클래스 초기화 블럭
	}
	
	{
		System.out.println("{ }");			//인스턴스 초기화 블럭
	}
	
	public Ex40_initialization() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("Ex40_initialization bt = new Ex40_initialization(); ");
		Ex40_initialization bt = new Ex40_initialization();
		
		System.out.println("Ex40_initialization bt2 = new Ex40_initialization(); ");
		Ex40_initialization bt2 = new Ex40_initialization();
		
	}

}
