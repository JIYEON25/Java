package jy.java.exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputEx {
	public static void main(String[] args) throws IOException {
//		InputStreamReader ir = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(ir);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 = ");
		String name = br.readLine();
		System.out.print("사는 곳 = ");
		String address = br.readLine();
		System.out.print("나이 = ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println(name + "님 " + age + "세 이군요." 
						+  address + "로 연락드리겠습니다.");
	}
}
