package jy.java.test05;

import java.util.Scanner;

/**
 * 야구게임
 * 숫자는 무조건 3자리이며, 컴퓨터가 랜덤하게 만들어 냅니다.
 */
public class Q12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean gameStart = true;
		
		while(gameStart) {
			System.out.print("Start game? (y/n) : ");
			char a = scan.next().charAt(0);
			
			if(a == 'y') {
				String num = String.valueOf((int)((Math.random()*900) + 100));
				System.out.println("A number has been generated.");
				
				System.out.println(num);
				
				int[] numArray = new int[3];	//3자리 숫자를 넣은 배열
				int[] gNumArray = new int[3];	// 내가 예상한 3자리 숫자 배열
				
				for(int i=0; i<3; i++) {
					numArray[i] = num.charAt(i);
				}//end for
				
				for(int k=1; k<=2; k++) {
					System.out.print("Guess Number : ");
					String gNum = scan.next();
					for(int i=0; i<3; i++) {
					gNumArray[i] = gNum.charAt(i);
					}
				
					int countBall = 0;
					int countStrike = 0;
					
					
					for(int i=0; i<gNumArray.length; i++) {
						for(int j=0; j<numArray.length; j++) {
							if((gNumArray[i]-'0') == (numArray[j]-'0')) {
								if(i == j) {
									countStrike++;
								}else {
									countBall++;
								}
							}//end if
						}
					}//end for
					System.out.println(k + "구 : " + countStrike + "스트라이크, " + countBall + "볼");
				}//end for k
			}else if(a == 'n') {
				System.out.println();
				System.out.println("End Game");
				gameStart = false;
			}
			
		}// end while
		
		
		
		
		
		
	}
}
