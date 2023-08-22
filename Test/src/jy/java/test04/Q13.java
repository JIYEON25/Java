package jy.java.test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  1 ~ 200사이의 난수를 발생하여 데이터를 입력받아서 발생한 숫자를 맞추는 프로그램
 *  10회의 기회를 제공하고 10회안에 맞추지 못할 경우 틀린 것으로 간주
 */
public class Q13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean isStop = false;
		int times = 0;
		
		while(!isStop) {
			System.out.println("** 1~200 사이의 난수를 발생하였습니다. **");
			System.out.println("** 맞추어보세요. **");
			int a = (int)(Math.random()*200) -1;
			String answer = "";
			
			for(times=1; times<=10; times++) {
				System.out.print("데이터 입력 : ");
				answer = br.readLine();
				
				if(Integer.parseInt(answer) > a) {
					System.out.println("컴퓨터 발생한 숫자가 더 작습니다.");
				}else if(Integer.parseInt(answer) < a) {
					System.out.println("컴퓨터 발생한 숫자가 더 큽니다.");
				}
				if(Integer.parseInt(answer) == a) {
					System.out.println("정답입니다. " + times + "번만에 맞추셨습니다.");
					isStop=true;
					break;
				}
				
			}//end for
			
			if(!isStop) {
				System.out.println("실패하였습니다.");
				
			}//end if
			System.out.print("계속하시겠습니까?(y/n): ");
			char choice = br.readLine().charAt(0);
			if(choice == 'y') {
				System.out.println("게임을 계속 진행합니다.");
				isStop = false;
			}else if(choice == 'n') {
				System.out.println("프로그램을 종료합니다.");
				isStop = true;
			}
			
		}//end while
		
		
	}
	
}
