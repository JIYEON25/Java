package jy.java.exam25;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		int number = scan.nextInt();

		System.out.printf("스캔 : %d\n", number);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.printf("스캔 : %s", name);
		scan.close();
	}

}
