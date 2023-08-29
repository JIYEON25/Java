package jy.java.test05;

import java.util.Scanner;

/**
 * 숫자를 입력받아서 2진수로 바꾸어주는 프로그램
 *  숫자는 0에서 255까지만 입력
 */
public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 = ");
		int num = scan.nextInt();
		
		if(num >=0 && num < 256) {
			String bNum = String.format("%08d", Integer.parseInt(Integer.toBinaryString(num)));
			System.out.println(bNum.substring(0, 4) + " " + bNum.substring(4));
		}else {
			System.out.println("숫자를 잘못 입력하였습니다.");
			System.out.println("0~255 사이의 숫자를 입력해주세요.");
		}
		
		
	}
}
