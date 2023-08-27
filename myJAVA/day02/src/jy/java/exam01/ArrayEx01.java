package jy.java.exam01;

public class ArrayEx01 {
	public static void main(String[] args) {
		int[] x; // 배열의 선언
		x = new int[3]; // 배열의 생성(초기화)
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		
		for(int i=0; i<x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		System.out.println();
		
		for(int value : x) {
			System.out.println("value = " + value);
		}
		
	}
	
}
