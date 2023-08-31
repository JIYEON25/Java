package chapter04;

public class Ex21_continue {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0) {
				continue;			// 블럭의 끝으로 이동. 반복문을 벗어나지 않음.
			}
			System.out.println(i);
		}
		
	}

}
