package jy.java.test05;

/**
 * 시작 값과 끝 값을 입력하여 
 * 시작부터 끝 값까지 출력하고 합을 구하는 프로그램
 */
public class Q08 {
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[args.length-1]);
		
		int sum = 0;	//합
		
		if(num1 > num2) {
			for(int i=num2; i<num1+1; i++) {
				sum += i;
				System.out.print(i + " ");
			}
		}else if(num1 < num2) {	
			for(int i=num1; i<num2+1; i++) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		
		
		System.out.println();
		
		System.out.println("합 = " + sum);
		
		
	}
}
