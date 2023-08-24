package jy.java.test05;

import java.io.IOException;

/**
 * 이름(name), 국어(kor), 영어(eng), 수학(mat) 점수를 입력받아서 
 * 총점(tot), 평균(avg)을 구하는 프로그램
 *  평균은 소수점 3째 자리에서 반올림해서 소수점 2째 자리까지 출력
 */
public class Q06 {
	public static void main(String[] args) throws IOException {
		
		String[] student = new String[args.length];
		for(int i=0; i<student.length; i++) {
			student[i] = args[i];
		}
		
		int total = 0;
		for(int i=1; i<student.length; i++) {
			total += Integer.parseInt(student[i]);
		}
		
		float avg = total / (float)student.length;
		avg = (int)((avg + 0.005) * 100) / 100.f;
		
		System.out.println();
		System.out.println("	 *** " + student[0] + " 성적표 ***	");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=1; i<student.length; i++) {
			System.out.print(student[i] + "\t");
		}
		System.out.println(total + "\t" + avg);
	}
	
}
