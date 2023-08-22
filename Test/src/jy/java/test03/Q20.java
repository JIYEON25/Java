package jy.java.test03;

import java.util.Scanner;

/**
 * 밑변과 높이를 입력받아서 삼각형의 넓이를 구하는 프로그램
 */
public class Q20 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		int width = scan.nextInt();
		System.out.print("높이 : ");
		int height = scan.nextInt();
		
		System.out.println("삼각형 넓이 = " + (width * height)/2.f);
	}
}
