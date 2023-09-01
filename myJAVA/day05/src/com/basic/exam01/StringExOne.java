package com.basic.exam01;

/**
 * 명시적, 암시적 객체 생성
 * 	- static 메모리 앞에 Registry&Constant 메모리가 있습니다.
 */
public class StringExOne {
	public static void main(String[] args) {
		
		// 암시적 객체 생성
		String s1 = "Twinkle";
		String s2 = "Twinkle";
			/* 
			 * 
			 */
		
		
		if(s1 == s2) {
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");
		}
			/*
				s1 == s2
					- 같은 값을 연속으로 저장하는 경우 Registry&Constant에 Twinkle이 저장됩니다.
			    	- Twinkle이 저장된 Registry&Constant 메모리 주소를 Stack 공간의 s1, s2에 저장합니다.
			 */
			
		// 명시적 객체 생성
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");

		if(s3 == s4) {
			System.out.println("s3 == s4");
		} else {
			System.out.println("s3 != s4");
		}		
			/*
				s3 != s4
					- Heap 메모리에 Little Star를 각각 저장합니다.
					- 각각 할당 받은 Heap 메모리 주소를 Stack 메모리 s3, s4에 저장합니다.
			 */
		
		// 명시적으로 생성한 객체의 내용이 같은지 확인
		if(s3.equals(s4)) {
			System.out.println("s3 == s4");
		}
			/*
				s3 == s4
			 */
	}
}
