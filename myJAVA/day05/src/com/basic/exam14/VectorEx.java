package com.basic.exam14;

import java.util.Vector;

class AA{
	int a;
	AA(int a){
		this.a = a;
	}
}

public class VectorEx {
	public static void main(String[] args) {
		
		/*
		 * 1) Vector vc = new Vector();
		 * 
		 * 2) vc.add(new AA(10)); > 노란 밑줄
		 * Type safety: 
		 * The method add(Object) belongs to the raw type Vector. 
		 * References to generic type Vector<E> should be parameterized.
		 * 		-- 객체로 받아오므로 다른 타입이어도 오류가 발생하지 않습니다.
		 * 		-- 다른 타입을 저장한 경우 elementAt()에서 형변환 시 오류가 발생할 수 있음을 경고
		 * 	>>> generic 
		 */
		
		// 3) 타입을 미리 지정합니다.
		Vector<AA> vc = new Vector<AA>();
		
		// 객체를 생성해서 추가합니다.
		vc.add(new AA(10));
		vc.add(new AA(20));
		vc.add(new AA(30));
		vc.add(new AA(10));
		vc.add(new AA(40));
		vc.add(new AA(50));
		
		// 1번방에 15 객체를 저장 >> 밀림
		vc.add(1, new AA(15));
		
		for(int i=0; i<vc.size(); i++) {
			
			// elementAt() : 값을 꺼내옴
			/*
			AA ap = (AA)vc.elementAt(i);
			 - 값이 원래 AA 타입이었으므로 AA 형변환이 가능합니다.
			 */
			
			// 4) 타입을 지정했으므로 변환하지 않아도 읽어들일 수 있습니다.
			AA ap = vc.elementAt(i);
			
			System.out.println(ap.a);
		}
		
		// removeElementAt() : 4번 방 제거 >> 당겨옴
		vc.removeElementAt(4);
		

		for(int i=0; i<vc.size(); i++) {
			AA ap = (AA)vc.elementAt(i);
			System.out.println("After = " + ap.a);
		}
	}
}
