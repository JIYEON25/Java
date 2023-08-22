package jy.java.test03;

import java.util.Scanner;

/**
 * 초를 입력받아서 분으로 계산하는 프로그램
 */
public class Q21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요 : ");
		int sec = scan.nextInt();
		
		int min = sec / 60;
		int remain = sec % 60;
		
		System.out.println(sec + "초는 " + min + "분 " + remain + "초 입니다.");
		
		
	}
	
	
}
