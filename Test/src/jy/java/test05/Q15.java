package jy.java.test05;

import java.util.Scanner;

/**
 * 버블정렬을 수행하는 알고리즘
 */
public class Q15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 갯수를 입력하세요 : ");
		int num = scan.nextInt();
		int[] bubble = new int[num];
		
		for(int i=0; i<bubble.length; i++) {
			System.out.print("숫자" + (i+1) + " 입력 : ");
			int a = scan.nextInt();
			bubble[i] = a;
		}//end for		
		
		for(int i=0; i<bubble.length-1; i++) {
			for(int j=0; j<bubble.length-1-i; j++) {
				if(bubble[j] > bubble[j+1]) { 
					int temp = bubble[j];
					bubble[j] = bubble[j+1];
					bubble[j+1] = temp;
				}
			}
		}//end for
			
		for(int i=0; i<bubble.length; i++) {
			System.out.print(bubble[i] + " ");
		}
		
		
		
	}
}
