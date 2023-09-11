package chapter08;

public class Ex09_Exception {

	public static void main(String[] args) {
		try {
//			throw new Exception("고의로 발생시킴");
			Exception e = new Exception("고의로 발생시킴");
			throw e;
		} catch (Exception e) {
			System.out.println("에러메세지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}

}
