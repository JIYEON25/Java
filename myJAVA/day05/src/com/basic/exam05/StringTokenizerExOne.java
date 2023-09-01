package com.basic.exam05;

import java.util.StringTokenizer;

public class StringTokenizerExOne {
	
	StringTokenizer st;
	
	public StringTokenizerExOne(String str) {
		System.out.println("str : " + str);
		st = new StringTokenizer(str);
	}
	
	public StringTokenizerExOne(String str, String delim){
		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim);
	}
	
	public void print(){
		System.out.println("Token count : " + st.countTokens());
		
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {
		
		StringTokenizerExOne st1 = new StringTokenizerExOne("Happy day");
		st1.print();
		
		StringTokenizerExOne st2 = new StringTokenizerExOne("2005/08/15","/");
		st2.print();
	}
}
