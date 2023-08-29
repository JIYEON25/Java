package chapter03;

public class Ex10_ArithmeticConversion {

	public static void main(String[] args) {
		System.out.println(5/2);
		System.out.println(5/(float)2);
		
		System.out.println();
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);			//데이터 손실(byte<300)
		
		System.out.println();
		int aa = 1_000_000;
		int bb = 2_000_000;
		
		long cc = aa * bb;
		System.out.println(cc);
		
		System.out.println();
		long aaa = 1_000_000 * 1_000_000;		//오버플로우 발생
		long bbb = 1_000_000 * 1_000_000L;		//L을 붙여서 형변환 해줘야함.
		System.out.println("aaa = " + aaa);
		System.out.println("bbb = " + bbb);
		
	}

}
