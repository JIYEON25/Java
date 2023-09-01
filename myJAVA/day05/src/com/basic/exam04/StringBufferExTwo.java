package com.basic.exam04;

/**
 * StringBuffer 길이
 */
public class StringBufferExTwo {
	public static void main(String[] args) {
		
		// 10+16개를 저장하는 공간
		StringBuffer sb = new StringBuffer("1234567890");
		
		System.out.println("sb buffer's size : " + sb.capacity());
		System.out.println("sb length : " + sb.length());
			/*
				sb buffer's size : 26
				sb length : 10
			 */
		
		// 데이터 추가 : 17개 문자를 저장하는 공간을 생성 + sb에서 저장한 공간과 이어 붙이는 공간 지정
		sb.append("ABCDEFGHIJKLMNOPQ");
		System.out.println("sb buffer's size : " + sb.capacity());
		System.out.println("sb length : " + sb.length());
			/*
				sb buffer's size : 54
				sb length : 27
			 */
		
		// 데이터 삭제 : 문장의 길이는 줄어들지만 메모리 저장공간은 줄어들지 않습니다.
		sb.delete(1, 20);
		System.out.println("sb buffer's size : " + sb.capacity());
		System.out.println("sb length : " + sb.length());
			/*
				sb buffer's size : 54
				sb length : 8
			 */
	}
}
