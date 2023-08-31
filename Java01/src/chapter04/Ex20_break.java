package chapter04;

public class Ex20_break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break;		// break문이 수행되면  while문을 벗어남.
			}
			++i;
			sum += i;			// sum += ++i; 
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
