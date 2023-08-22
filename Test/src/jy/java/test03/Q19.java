package jy.java.test03;

import java.io.IOException;

/**
 * System.in.read() 
 * 영어 알파벳을 입력받아서 대문자 이면 소문자로 소문자이면 대문자로 바꾸어주는 프로그램
 */
public class Q19 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("알파벳입력 = ");
		char alpha = (char)System.in.read();
		
		if(Character.isUpperCase(alpha)) {
			alpha = Character.toLowerCase(alpha);
		}else if(Character.isLowerCase(alpha)) {
			alpha = Character.toUpperCase(alpha);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("변경된 알파벳은 " + alpha + "입니다.");
		
	}
	
	
}
