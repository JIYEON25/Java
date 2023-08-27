package jy.java.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 성적표 - 한사람에 대해서, 단 응시과목에 대해서 자유도를 부여
 * 실행: java ArrayEx03 과목1 과목2 ... 과목N
 */
public class ArrayEx03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생이름 = ");
		String name = br.readLine();
		
		String[] subject = new String[args.length];
		// 과목수 = subject.length = args.length
		for(int i=0; i<subject.length; i++) 
			subject[i] = args[i]; 	// 과목명을 옮기기
		
		int[] jumsu = new int[subject.length + 1];		// +1은 총점 공간
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i] + " 점수 = ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; // 총점계산
		}
		
		float avg = jumsu[jumsu.length-1] / (float)subject.length;
		avg = (int)((avg + 0.005) * 100) / 100.f; // 소수점 3째자리에서 반올림.
		
		char grade = 0;
		switch((int)avg / 10) {
		case 10:
		case  9: grade = 'A'; break;
		case  8: grade = 'B'; break;
		case  7: grade = 'C'; break;
		case  6: grade = 'D'; break;
		default: grade = 'F'; break;
		}
		
		System.out.println();
		System.out.print("**********");
		for(int i=0; i<subject.length; i++) System.out.print("****");
		System.out.print("성 적 표");
		for(int i=0; i<subject.length; i++) System.out.print("****");
		System.out.println("**********");
		System.out.print("이름\t");
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t평균\t학점");
		
		System.out.print(name + "\t");
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i] + "\t");
		}
		System.out.println(avg + "\t" + grade);
	
	}
}
