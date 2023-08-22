package jy.java.test04;

import java.util.Scanner;

/**
 * 1 ~ 100사이의 난수 2개 발생하여 출력(a, b)합니다 답(dap)을 입력받아 맞는지 틀리는지 출력하는 프로그램
 * 한 문제당 10점(score)처리하여 10문제
 */
public class Q12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean isStop = false;
		while(!isStop) {
			int score = 0;
			for(int i=1; i<=3; i++) {
				int a = (int)(Math.random()*100) + 1;
				int b = (int)(Math.random()*100) + 1;
				int dap = a + b;
				System.out.print("[" + i + "] " + a + " + " + b + " = ");
				int answer = scan.nextInt();
				
				if(answer == dap) {
					System.out.println("정답입니다.");
					score += 10;
				}else {
					System.out.println("틀렸습니다. 정답은 " + dap + "입니다.");
				}
			}//end for
			System.out.println("당신의 점수는 " + score + "점 입니다.");
			System.out.println();
			System.out.print("계속하시겠습니까? (y/n) : ");
			char choice = scan.next().charAt(0);
			
			System.out.println();
			
			if(choice == 'y') {
				System.out.println("게임을 계속합니다.");
			}else if(choice == 'n') {
				System.out.println("프로그램을 종료합니다.");
				isStop = true;
			}
			System.out.println();
			
		}//end while
		
	}
}
