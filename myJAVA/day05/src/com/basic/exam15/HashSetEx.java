package com.basic.exam15;

import java.util.HashSet;
import java.util.Iterator;

class AData{
	int x;
	int y;
	public AData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void disp() {
		System.out.println("x : " + x + ", y : " + y);
	}
}

public class HashSetEx {
	public static void main(String[] args) {
		
		AData ap = new AData(10, 20);
		AData bp = new AData(20, 30);
		AData cp = new AData(30, 40);
		
		HashSet<AData> hs = new HashSet<AData>();
		hs.add(ap); hs.add(bp); hs.add(cp);
		System.out.println("해쉬 코드 : " + hs.hashCode());
		System.out.println("총 데이터 크기 : " + hs.size());
			/*
				해쉬 코드 : 479587763
				총 데이터 크기 : 3
			 */
		
		Iterator<AData> it = hs.iterator();
		while(it.hasNext())
		((AData)it.next()).disp();
			/*
				x : 10, y : 20
				x : 30, y : 40
				x : 20, y : 30
			 */
	}
}
