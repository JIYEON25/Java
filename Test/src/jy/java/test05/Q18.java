package jy.java.test05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 로또 추천 프로그램
 */
public class Q18 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] lotto;
		System.out.print("몇 게임 하실건가요? : ");
		int number = Integer.parseInt(br.readLine());
		
		lotto = new int[number][6];
		
		for(int game=0; game<lotto.length; game++) {
			for(int col=0; col<lotto[game].length; col++) {
//				lotto[game][col] = (int)(Math.random()*7) + 1; // 확인용
				lotto[game][col] = (int)(Math.random()*45) + 1; // 1~45
				for(int tCol=0; tCol<col; tCol++) {
					if(lotto[game][col] == lotto[game][tCol]) {
						col--;
						break;
					}
				}
			}//end for col
			
			int count = 0;
			
			for(int tgame=0; tgame<game; tgame++) {
				count = 0;
				for(int col=0; col<lotto[game].length; col++) {
					for(int tCol=0; tCol<lotto[tgame].length; tCol++) {
						if(lotto[game][col] == lotto[tgame][tCol]) {
							count++; break;
						}
					}
					if(col+1 != count) break;
				}
				if(count == 6) {
					game--;
					break;
				}
			}
		} //end for game
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(i + 1 + "번째 추천번호 :	");
			for(int j=0; j<lotto[i].length; j++) {
				System.out.print(lotto[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
