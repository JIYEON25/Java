package jy.java.test04;

import java.util.Scanner;

/**
 * 국어점수 영어점수 수학점수를 입력받아 총점 평균 학점을 출력하는 프로그램
 */
public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();
		System.out.print("국어점수를 입력하세요 : ");
		int korScore = scan.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int engScore = scan.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int mathScore = scan.nextInt();
		
		int total = korScore + engScore + mathScore;
		double avg = (double) total / 3;
		
		char credit;
		
		if(avg >= 90) {
			credit = 'A';
		}else if((avg < 90) && (avg >= 80)) {
			credit = 'B';
		}else if((avg < 80) && (avg >= 70)) {
			credit = 'C';
		}else
			credit = 'F';
		System.out.println();
		
		System.out.println("이름	국어	영어	수학	총점	평균	학점");
		System.out.printf(name + "	" + korScore + "	" + engScore + "	" 
				+ mathScore + "	" + total + "	%.2f	" + credit, avg);
		
		
	}
}
