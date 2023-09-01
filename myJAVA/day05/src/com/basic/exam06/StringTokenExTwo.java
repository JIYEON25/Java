package com.basic.exam06;

import java.util.StringTokenizer;

/**
 * StringTokenizer
 * 	- countTokens() : token된 자원의 수 반환
 * 	- hasMoreTokens() : token 할 수 있는 자원이 있으면 true
 * 	- nextToken() : token 된 자원을 반환
 * 
 * 	- split()과의 차이
 * 		- 무의미한 공백도 자리를 차지
 */
public class StringTokenExTwo {
	public static void main(String[] args) {
		
		String str = "학교,집,,게임방";
		
		StringTokenizer tokens = new StringTokenizer(str, ",");
		
		// hasMoreTokens()
		for (int x = 1; tokens.hasMoreTokens(); x++) {
			System.out.print("문자" + x + " = " + tokens.nextToken()+"\t");
		}
		
		System.out.println();
		System.out.println("=============================");
		
		// split() : 공백 인식
		String[] values = str.split(",");
		for (int x = 0; x < values.length; x++) {
			System.out.print("문자" + (x + 1) + " = " + values[x]+"\t");
		}
		System.out.println();
			/*
				문자1 = 학교	문자2 = 집	문자3 = 게임방	
				=============================
				문자1 = 학교	문자2 = 집	문자3 = 	문자4 = 게임방
			 */
	}
}

/*
	- 채팅 서버를 제작
		100 : a : Hi
			- 100 : 모든 서버에 전송
			- a : 보내는 사람
			- Hi : 문자
		200 : a : c : Bye
			- 200 : 특정 서버에 전송
			- a : 보내는 사람
			- c : 받는 사람
			- Bye : 문자
		protocol : 100, 200
 */
