package com.basic.exam10;

import java.util.Random;
import static java.lang.System.out;

public class RandomEx {
	public static void main(String[] args) {
		
		String[] lesson = {"Java Beg", "JSP", "XML"};
		Random r1 = new Random();
		
		int index = r1.nextInt(lesson.length);
		out.println("Subject : " + lesson[index]);
			/*
				Subject : XML 
					- 랜덤으로 출력됩니다.
			 */
	}
}
