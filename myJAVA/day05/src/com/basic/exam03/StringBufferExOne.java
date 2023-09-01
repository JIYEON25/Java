package com.basic.exam03;

/**
 * StringBuffer
 */
public class StringBufferExOne {
	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Java");
		
		// 문자 추가
		sb.append("1.6");
		System.out.println(sb);
			/*
				Java1.6
			 */
		
		// 문자 삭제
		sb.delete(3, 5);
		System.out.println(sb);
			/*
				Jav.6
			 */
		
		// 문자 삽입
		sb.insert(3, "A1");
		System.out.println(sb);
			/*
				JavA1.6
			 */
		
		// 문자 교체
		sb.replace(4, 7, "jum");
		System.out.println(sb);
			/*
				JavAjum
			 */
		
		// 문자 뒤집기
		sb.reverse();
		System.out.println(sb);
			/*
				mujAvaJ
			 */
		
	}
}
