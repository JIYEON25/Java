package jy.java.test03;

import java.io.IOException;

/**
 * System.in.read() 이용
 * 단 자리 숫자 2개를 입력받아서 합 차 곱 나누기 나눗셈의 나머지를 구하는 프로그램
 */
public class Q17 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("첫 번째 숫자를 입력하세요(1~9) : ");
		int num1 = System.in.read() - '0';
		System.in.read(); System.in.read();
		System.out.print("두 번째 숫자를 입력하세요(1~9) : ");
		int num2 = System.in.read() - 48;
		
		
		int add = num1 + num2;
		
		int subtract = 0;
		if(num1 >= num2) {
			subtract = num1 - num2;
		}else if(num1 < num2) {
			subtract = num2 - num1;
		}
		
		int multi = num1 * num2;
		
		int divide = (int)(num1 / num2);
		int remain = num1 % num2;
		
		System.out.println("두 숫자의 합은 " +  add + "이고, 차는 " + subtract + "이며, 곱은 " 
						  	+ multi + ", 나눈 값은 " + divide + "이고 나눗셈의 나머지는 " + remain + "입니다.");
	
	
	}
}
