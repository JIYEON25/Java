package jy.java.test05;

/**
 * 3과목의 점수를 입력받아서 합격이지 불합격인지 출력하는 프로그램
 * 3개의 과목이 전부 40이상이어야 하고 평균이 60이어야 "합격"
 * 평균이 60이 넘지만 1개의 과목이라도 40 미만이면 "과락으로 불합격"
 * 평균이 60미만이면 "불합격"
 */
public class Q07 {
	public static void main(String[] args) {
		
		int[] score = new int[args.length];
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(args[i]);
		}
		
		boolean pass = true;
		int total = 0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
			
			if(score[i] < 40) {
				pass = false;
			}
		}
		
		float avg = total / (float)score.length;
		avg =(int)((avg +0.005) * 100) / 100f;
		
		if(avg < 60) {
			pass = false;
		}
		
		if(pass) {
			System.out.println("합격");
		}else {
			if(avg >= 60) {
				System.out.println("과락으로 불합격");
			}else {
				System.out.println("불합격");
			}
		}
		
		
		
		
		
	}
	
}
