package jy.java.test04;

import java.io.IOException;

/**
 * 단 자리 계산기 프로그램
 * 사칙연산만 수행하며 입력은 반드시 0~9사이의 숫자만
 * System.in.read()를 이용
 */
public class Q09 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("0~9 사이 첫 번째 숫자를 입력해주세요 : ");
		int num1 = System.in.read() - 48;
		System.in.read(); System.in.read();
		
		System.out.print("사칙연산 중 하나를 입력해주세요(+,-,*,/) : ");
		char op = (char)System.in.read();
		System.in.read(); System.in.read();
		
		System.out.print("0~9 사이 두 번째 숫자를 입력해주세요 : ");
		int num2 = System.in.read() - 48;
		
		if(op == '+') {
			System.out.println("연산결과 : " + (num1 + num2));
		}else if(op == '*') {
			System.out.println("연산결과 : " + (num1 * num2));
		}else if(op == '/') {
			System.out.printf("연산결과 : %.2f", (double)num1 / num2);
		}else if(op == '-') {
			System.out.println("연산결과 : " + (num1 - num2));	
		}else
			System.out.println("잘못된 연산자입니다.");
		
		
		
		
	}
	
}
