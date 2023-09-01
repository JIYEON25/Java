package com.basic.exam19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/** 
 * 종합 예제
 */
public class CustomerManager {
	
	// 멤버 필드
	// 5) while문 정보
	private boolean isStop;
	
	// 7) 입력받을 객체 생성
	private BufferedReader br;
	
	// 24) 정보 저장할 배열 객체 선언
	private ArrayList<Customer> data;
	
	// 29) 위치 정보 저장 변수 선언
	private int position;
	
	// 2) 기본 생성자
	public CustomerManager() {
		// 6) isStop 초기화
		isStop = false;
		
		// 7-1) 입력받을 객체 생성
		br = new BufferedReader(new InputStreamReader(System.in));
		
		// 25) 배열 초기화
		data = new ArrayList<Customer>();
		
		// 30) 위치 정보 저장할 변수 초기화
		position = -1;
	}
	
	// 4) 메소드
	public void start() throws IOException {
		// 메뉴 입력값 초기화
		int menu = -1;
		
		while(!isStop) {
			// 메뉴
			System.out.println("=============");
			System.out.println("1. Signup");
			System.out.println("2. Search");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. List");
														/**
														 * 6 : New File
														 * 7 : Open File
														 * 8 : Save
														 * 9 : Save As
														 */
			System.out.println("0. End");
			System.out.println("=============");
	
			System.out.print("Menu : ");
			
			// 9) 예외 처리
			try {	// 입력 받음
				// 8) 메뉴 입력
				menu = Integer.parseInt(br.readLine());
			} catch(NumberFormatException e){	// 숫자 아니면
				menu = -1;
			} // end try
			
			// 11) 메뉴별 실행처리
			switch(menu) {
			case 1:
				addCustomer();
				break;
			case 2: 
				searchCustomer();
				break;
			case 3: 
				updateCustomer();
				break;
			case 4: 
				deleteCustomer();
				break;
			case 5: 
				display();
				break;
			case 0: 
				stop();
				break;
			default: 
				System.out.println("Error : Wrong number");
				break;
			}	// end switch(menu)
		} // end while(!isStop)
	}
	
	// 12) 메뉴별 메소드 생성
	// 정보 입력
	public void addCustomer() throws IOException {
		
		// 16) 정보 입력
		System.out.println();
		System.out.print("Name : ");
		String name = br.readLine();
		System.out.print("Age : ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Phone : ");
		String phone = br.readLine();
		System.out.print("Address : ");
		String address = br.readLine();
		
		// 17) 저장하는 방법???	>> Customer class 파일 생성
		
		// 23) 저장할 객체 생성
		Customer myCustomer = new Customer(name, age, phone, address);
		
		// 26) 배열에 저장
		data.add(myCustomer);
	}

	// 정보 검색
	public void searchCustomer() throws IOException {
		// 33) 저장되어 있는 위치 정보 초기화
		position = -1;
		
		// 27) 검색 정보 찾기
		System.out.println();
		System.out.print("Search Name : ");
		String name = br.readLine();
		
		for(int i=0; i<data.size(); i++) {
			Customer myCustomer = data.get(i);
			
			// 28) 찾은 경우 위치 값을 저장해야 알 수 있음
			if(myCustomer.getName().equals(name)) {
				// 31) 위치 정보 저장
				System.out.println("Success Search " + name);
				position = i;
			}
		}
		
		// 32) 일치하는 데이터가 없는 경우	>> 없는 정보를 두 번째로 찾는 경우 > 이미 저장된 이전의 정보를 찾습니다.
		if(position<0) {
			System.out.println("No Data " + name);
		}
	}

	// 정보 수정
	public void updateCustomer() throws IOException {
		System.out.println();
		
		// 39) 검색 안한 경우
		if(position<0) {
			System.out.println("Please Search Member");
			return;
		}

		// 40) 수정할 데이터 추출
		Customer myCustomer = data.get(position);
		
		// 41) while문 조건
		boolean isLoop = true;
		
		// 42) switch 문 조건
		int menu = -1;
		
		// 43) while문 작성
		while(isLoop) {
			System.out.println("Update " + myCustomer.getName());
			
			System.out.println("1. Phone");
			System.out.println("2. Address");
			System.out.println("0. Cancle Update");
			System.out.println();
			
			System.out.print("Menu : ");
			
			// 44) 메뉴 입력
			try {
				menu = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e){
				menu = -1;
			}
			
			System.out.println();
			switch(menu) {
			case 1:
				// 45) 전화번호
				System.out.print("Phone : ");
				String imsiPhone = br.readLine();
				myCustomer.setPhone(imsiPhone);
				System.out.println("Success Update Phone");
				
				// 46) while문 종료
				isLoop = false;
				break;
			case 2:
				// 47) 주소
				System.out.print("Address : ");
				String imsiAddress = br.readLine();
				myCustomer.setAddress(imsiAddress);
				System.out.println("Success Update Address");
				
				// 48) while문 종료
				isLoop = false;
				break;
			case 0:
				// 49) 정보 수정 취소
				System.out.print("Cancle update " + myCustomer.getName() + "? (y/n)");
				String result = br.readLine();
				
				if(result.equals("Y") || result.equals("y")) {
					System.out.println("Cancle update");
					// 50) switch문 종료
					isLoop = false;
				}
				// 아닌 경우 다시 while문 실행
				break;
			default : 
				// 51) 잘못된 번호 입력시
				System.out.println("Error : Wrong number");
				break;
			}
		}
	}

	// 정보 삭제
	public void deleteCustomer() throws IOException {
		System.out.println();
		
		// 34) 검색 안한 경우
		if(position<0) {
			System.out.println("Please Search Member");
			return;
		}

		// 35) 삭제할 데이터 추출
		Customer myCustomer = data.get(position);
		
		// 36) 삭제 여부 결정
		System.out.println("Delete " + myCustomer.getName() + "? (y/n)");
		String result = br.readLine();
		if(result.equals("Y") || result.equals("y")) {
			System.out.println("Success Delete " + myCustomer.getName());
			// 37) 데이터 삭제
			data.remove(position);
			// 38) 위치 정보 삭제
			position = -1;
		} else {
			System.out.println("Cancle Delete " + myCustomer.getName());
		}
	}

	public void display() {
		System.out.println();

		// 27) 정보 저장되는지 확인/ 출력
		for(int i=0; i<data.size(); i++) {
			Customer myCustomer = data.get(i);
			System.out.println(myCustomer.toString());
		}
	}

	// 13) 종료 > 실행해보기
	public void stop() throws IOException {
		System.out.println();
		System.out.print("End Program? (y/n)");
		
		String result = br.readLine();
		
		// 종료
		if(result.equals("Y") || result.equals("y")) {
			System.out.print("Bye");
			
			// 15) 효과 : 0.5초마다 . 출력
			for(int i=0; i<5; i++) {
				try {
					// 0.5초 멈춤
					Thread.sleep(500);
					System.out.print(".");
				} catch (InterruptedException e) {	}
			}
			System.out.println();
			
			// 14) while문 종료
			isStop = true;
		}
	}

	// main
	public static void main(String[] args) {
		
		// 1) 객체 생성_생성자 호출
		CustomerManager manager = new CustomerManager();
		
		// 10) 예외 처리
		try {
			// 3) 프로그램 시작
			manager.start();
		} catch(IOException e) {
		} // end try
	} // end main
}
