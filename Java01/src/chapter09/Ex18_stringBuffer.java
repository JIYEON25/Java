package chapter09;

public class Ex18_stringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));
		System.out.println();
		
		//StringBuffer의 내용을 String 으로 변환
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println(s.equals(s2));		
		//StirngBuffer는 equals가 오버라이딩 되어있지 않기 때문에 
		//toString()으로 String인스턴스를 얻어서 비교해야함.
	}
}
