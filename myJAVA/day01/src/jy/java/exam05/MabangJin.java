package jy.java.exam05;

import java.io.IOException;

public class MabangJin {
	
	public static void main(String[] args) throws IOException {
		System.out.print("숫자(홀수만) = ");
		int num = System.in.read() - 48;	
		System.in.read(); System.in.read();  // enter값 처리

		int [][] mabang = new int [num][num];
		int row = 0; 
		int col = num / 2;
		
		for (int su = 1; su <= num * num; su++) {
			mabang[row][col] = su;
			if (su % num == 0) {
				row++;
				continue;
			}
			row--; 
			col++;
			if (row < 0) row = mabang.length - 1;
			if (col > mabang.length - 1) col = 0;
		}
		
		// 결과 출력
		for (int i = 0; i < mabang.length; i++) {
			for (int j = 0; j < mabang[i].length; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
