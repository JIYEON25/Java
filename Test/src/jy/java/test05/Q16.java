package jy.java.test05;

import java.util.Scanner;

/**
 * 선택정렬 알고리즘
 */
public class Q16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 갯수를 입력하세요 : ");
		int num = scan.nextInt();
		int[] sel = new int[num];
		
		for(int i=0; i<sel.length; i++) {
			System.out.print("숫자" + (i+1) + " 입력 : ");
			int a = scan.nextInt();
			sel[i] = a;
		}//end for
		
		int[] count = new int[sel.length-1];
		for(int i=1; i<count.length; i++) {
			count[i] = i;
		}
		
		for(int i=0; i<sel.length-1; i++) {
			int min = i;
			for(int j=i+1; j<sel.length; j++) {
				if(sel[j]<sel[min]) {
					int temp = sel[j];
					sel[j] = sel[min];
					sel[min] = temp;
				}
			}
			
		}//end for i
		
		for(int i=0; i<sel.length; i++) {
			System.out.print(sel[i] + " ");
		}
		
	}

}
