package jy.java.exam08;

/**
 * 배열 복사 (arraycopy)
 */
public class ArrayEx08 {
	public static void main(String[] args) {
		String[] str = {"JAVA", "HTML", "JSP", "Spring"};
		String[] subject = new String[6];
		subject[0] = "Linux";
		subject[1] = "Oracle";
		System.arraycopy(str, 0, subject, 2, 4);
		
		for(int i=0; i<subject.length; i++) {
			System.out.println("subject[" + i + "] = " + subject[i]);
		}
		
		
	}
}
