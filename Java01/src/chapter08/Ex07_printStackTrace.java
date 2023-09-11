package chapter08;

public class Ex07_printStackTrace {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {			//참조변수 ae를 통해, ArithmeticException에 접근
			ae.printStackTrace();					//예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력
			System.out.println("예외메세지: " + ae.getMessage());	//발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을수 있음.
		}
		
		System.out.println(6);
	}
}
