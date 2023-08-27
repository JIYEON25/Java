package jy.java.exam01;

import java.io.IOException;

/**
 * System.in.read() 아스키코드값으로 입력을 받는다.
 * (char)System.in.read()문자 한 글자를 입력받는다.
 * System.in.read() - 48 숫자 한 글자를 입력받는다.
 */

public class InputTest {
	public static void main(String[] args) throws IOException {
		System.out.print("단자리 입력 테스트 : ");
		int number = System.in.read() - '0';
		System.out.println("입력내용 : " + number);
	}
}
