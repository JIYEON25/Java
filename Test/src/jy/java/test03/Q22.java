package jy.java.test03;

import java.util.Scanner;

/**
 * 금액을 입력받아서 화폐의 개수를 구하는 프로그램
 * 금액은 10원 이상 10만원 미만의 금액만 입력
 */
public class Q22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10원 이상 10만원 미만의 금액을 입력하세요: ");
		int money = scan.nextInt();
		
		int man = 0;
		int chun = 0;
		int bek = 0;
		int sib = 0;
		
		if(money/10000 != 0) {
			man = money / 10000;
			money -= man * 10000;
		}
		if(money/1000 != 0) {
			chun = money / 1000;
			money -= chun * 1000;
		}
		if(money/100 != 0) {
			bek = money / 100;
			money -= bek * 100;
		}
		if(money/10 != 0) {
			sib = money / 10;
		}
		
		System.out.println("만원 = " + man + "장");
		System.out.println("만원 = " + chun + "장");
		System.out.println("만원 = " + bek + "개");
		System.out.println("만원 = " + sib + "개");
	}

	
}
