package jy.java.test05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 가위바위보 게임
 */
public class Q13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = 1000;
		int menu = -1;
		boolean isStop = false;
		
		String[] msg = {"주먹", "가위", "보자기"};
		int[][] game = { {0, 1, -1}, {-1, 0, 1}, {1, -1, 0} };
		
		while(!isStop) {
			System.out.println("1. 주먹");
			System.out.println("2. 가위");
			System.out.println("3. 보자기");
			System.out.println("0. 게임종료");
			System.out.print("메뉴 선택 : ");
			
			try {
			menu = Integer.parseInt(br.readLine());
			}catch(NumberFormatException nfe) {
				menu = -1;
			}
			
			if(menu == 0) {
				System.out.println();
				System.out.print("정말로 종료하시겠습니까? (y/n) : ");
				char result = (char)System.in.read();
				System.in.read(); System.in.read();
				if(result == 'Y' || result == 'y') {
					System.out.println("게임을 종료합니다.");
					isStop = true;
				}
				System.out.println();
				continue;
			}
			
			if(menu != 1 && menu != 2 && menu != 3) {
				System.err.println("메뉴입력 오류 : 메뉴를 확인하시고 다시 입력해주세요.");
				continue;
			}
			
			
			System.out.println();
			System.out.print("베팅금액 : ");
			int batting = Integer.parseInt(br.readLine());
			
			if(batting >= money) {
				System.out.println("\n가진 돈보다 많이 거셨네요. All In으로 처리합니다.\n");
				batting = money;
			}else if(batting < 100) {
				System.out.println("\n최소 배팅긂액은 100원입니다.\n");
				if(money < 100) {
					System.out.println("가진 돈이 100원 이하 입니다.");
					isStop = true;
				}else 
					batting = 100;
			}
			
			System.out.println();
			System.out.print("결과를 보려면 Enter를 치세요.");
			System.in.read(); System.in.read();
			
			int computer = (int)Math.random()*3; // 0 주먹, 1 가위, 2 보자기
			
			System.out.print("Computer : " + msg[computer] + ", ");
			System.out.println("You : " + msg[menu-1]);
			if(game[menu-1][computer] == 0) {	// 비김
				System.out.println("Draw !!!");
			}else if(game[menu-1][computer] == 1) {	// 이김
				System.out.println("You Win !!!");
				money += batting;
			}else if(game[menu-1][computer] == -1) {	// 짐
				System.out.println("You loose !!!");
				money -= batting;
			}
			System.out.println("잔액 : " + money + "원");
			
			if(money >= 5000) {
				System.out.println();
				System.out.println("지나친 도박은 건강에 좋지않습니다. 강제종료합니다.");
				isStop = true;
			}else if(money >= 5000) {
				System.out.println();
				System.out.println("돈을 다 날렸네요.돈 벌어오세요 호갱님.");
				isStop = true;
			}
			
			System.out.println();
		} //end while
	}

}
