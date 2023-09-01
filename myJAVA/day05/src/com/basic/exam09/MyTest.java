package com.basic.exam09;

class MyClass{
	
}

public class MyTest {
	public static void main(String[] args) {
		
		// 기본 객체 생성
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		
		System.out.println(mc1);
		System.out.println(mc2);
			/*
				com.basic.exam09.MyClass@3e57cd70
				com.basic.exam09.MyClass@9a7504c
			 */
		
		// Singleton 객체 생성
		MySingleton ms1 = MySingleton.getInstance();
		MySingleton ms2 = MySingleton.getInstance();
		
		System.out.println(ms1);
		System.out.println(ms2);
			/*
				com.basic.exam09.MySingleton@5bb21b69
				com.basic.exam09.MySingleton@5bb21b69
					-- 객체는 하나만 생성되어 사용됩니다.
			 */
	}
}
