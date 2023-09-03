package chapter05;

public class Ex21_array2D {

	public static void main(String[] args) {
		int[][] score = {	{100,100,100},
							{20,20,20},
							{30,30,30},
							{40,40,40} };
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}//end for
		
		System.out.println("sum = " + sum);
	}//end main

}
