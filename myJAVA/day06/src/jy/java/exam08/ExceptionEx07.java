package jy.java.exam08;

public class ExceptionEx07 {
	int[] ss;
	public ExceptionEx07() {
		ss = new int[3];// 속성(멤버필드) 초기화
	}
	public void program(){
	for(int i=0; i<=ss.length; i++){
		System.out.println("for문의 시작 " + i + "번째");
		try {
			System.out.println(ss[i]);
		} catch (Exception e) {
			System.out.println("toString()" + e.toString());
			System.out.println("getMessage()" + e.getMessage());
			System.out.println("printStackTrace()");
			e.printStackTrace();
			System.err.println("예외발생 : code 1005");
			return;
		}finally{
			System.out.println("finally 영역");
		}
		System.out.println("for문의 끝" + i + "번째");
		}
	}
	 
	public static void main(String[] args) {
		ExceptionEx07 ref = new ExceptionEx07();
		ref.program();
		System.out.println("프로그램 끝");
	}
}
