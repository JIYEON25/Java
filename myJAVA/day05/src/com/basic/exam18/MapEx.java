package com.basic.exam18;

import java.util.HashMap;
import java.util.Set;
import static java.lang.System.out;

public class MapEx {
	public static void main(String[] args) {
		String[] msg = {"Berlin","Dortmund","Frankfurt", "Gelsenkirchen","Hamburg"};
		
		// HashMap 생성
		HashMap<Integer,String> map = new HashMap<Integer,String>(); 
		
		//맵에 저장
		for(int i=0 ; i<msg.length ; i++)
			map.put(i,msg[i]); 
		
		out.println(map.get(1));
			/*
				Berlin
			 */
		
		//맵에서 읽어오기
		Set<Integer> keys = map.keySet();
		for(Integer n : keys)
			 out.println(map.get(n)); 
			/*
				Berlin
				Dortmund
				Frankfurt
				Gelsenkirchen
				Hamburg
			 */
	}
}
