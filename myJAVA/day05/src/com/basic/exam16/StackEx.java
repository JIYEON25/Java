package com.basic.exam16;

import java.util.Stack;
import static java.lang.System.out;

/**
 * Stack
 * 	- peek() : 위에 반환
 * 	- pop() : 위에 삭제, 반환
 * 	- push() : 위에 객체 추가
 */
public class StackEx {
	public static void main(String[] args) {
		
		String[] groupA = {"Korea", "Japen", "China"};
		
		Stack<String> stack = new Stack<String>();
		
		for(String n : groupA)
			 stack.push(n);
		while(!stack.isEmpty())
			 out.println(stack.pop());
			/*
				China
				Japen
				Korea
			 */
	}
}
