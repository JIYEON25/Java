package jy.java.Exam17;

public class EnumEx01 {	// EnumEx01.class
	public enum Lesson {	// EnumEx01$Lesson.class
		JAVA, XML, EJB
	}
	
	public static void main(String[] args) {
		Lesson le = Lesson.JAVA;
		System.out.println("Lesson : " + le); //.toString
		System.out.println("Lesson : " + le.ordinal());
		System.out.println("XML : " + Lesson.XML);
	}
	
	
	
}
