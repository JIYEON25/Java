package jy.java.test03;

import java.util.Scanner;

/**
 * 국어점수 영어점수 수학점수를 입력받아 총첨과 평균을 출력해주는 프로그램
 */
public class Q18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = scan.nextLine();
		System.out.print("국어점수를 입력하세요: ");
		int korScore = scan.nextInt();
		System.out.print("영어점수를 입력하세요: ");
		int engScore = scan.nextInt();
		System.out.print("수학점수를 입력하세요: ");
		int mathScore = scan.nextInt();
		
		System.out.println();
		
		int total = korScore + engScore + mathScore;
		float avg = (float)total / 3;
		
		System.out.println("이름 = " + name);
		System.out.println("국어점수 = " + korScore);
		System.out.println("영어점수 = " + engScore);
		System.out.println("수학점수 = " + mathScore);
		System.out.printf(name + "님의 총점은 " + total + "이고 평균은 %.2f점 입니다.", avg);
		
		
		
		
	}

}
