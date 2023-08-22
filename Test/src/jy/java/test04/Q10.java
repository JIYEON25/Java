package jy.java.test04;

import java.io.IOException;

/**
 * 1~9단을 입력받아서 구구단을 출력하는 프로그램
 */
public class Q10 {
	public static void main(String[] args) throws IOException {
		System.out.print("단을 입력하세요 : ");
		int dan = System.in.read() -48;
		
		for(int i=1; i<10; i++) {
				System.out.println(dan + " x " + i + " = " + dan*i);
		}
		
	}
}
