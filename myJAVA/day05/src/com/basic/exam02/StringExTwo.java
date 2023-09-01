package com.basic.exam02;

/**
 * String 객체의 불변성
 */
public class StringExTwo {
	public static void main(String[] args) {
		
		String str = new String();
		str += "Hello";
		str += " Java";
		
		System.out.println("str : " + str);
			/*
				str : Hello Java
					- Heap 메모리에 String() 객체를 저장합니다.
					- Heap 메모리에 할당받은 String() 객체의 주소를 Stack 메모리에 str 변수를 저장합니다.
					
					- Heap 메모리에 Hello를 저장합니다.
					- 저장한 Hello 값을 새로운 String() 객체를 할당받아 저장합니다.
					- Heap 메모리에 Hello를 저장한 주소를 Stack 메모리의 str 변수에 저장합니다.
					- Heap 메모리에 _Java 를 저장합니다.
					- 저장한 _Java 값을 Hello를 저장한 String() 객체와 연결하여 새로운 String() 객체를 저장합니다.
					- 저장한 Hello_Java의 주소를 Stack 메모리의 str 변수에 저장합니다.
					
					- 낭비되는 공간
						1) 처음 생성된 String() 객체
						2) Hello
						3) Hello가 저장된 String() 객체
						4) _Java 
						-- Java에서는 자동으로 낭비되는 공간을 정리해주는 기능이 있습니다.
			 */
	}
}
