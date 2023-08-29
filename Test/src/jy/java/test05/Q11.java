package jy.java.test05;

/**
 *  프로그램 시작 시 2개의 매개변수를 받아서 처리하는 프로그램
 */
public class Q11 {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		
		String[] param = new String[args.length-1];
		for(int i=0; i<param.length; i++) {
			param[i] = args[i+1];
		}
		
		if(num != param.length) {
			if(num < param.length) {
				System.out.println("입력한 숫자와 매개변수의 개수가 올바르지 않습니다.");
				System.err.println("Usage : java ExamEx count param1 param2... paramCOUNT");
			}else if(param.length < 2) {
				System.out.println("매개변수는 반드시 2개 이상이어야 합니다.");
				System.err.println("Usage : java ExamEx count param1 param2... paramCOUNT");
			}
		}else if(num == param.length) {
			for(int i=0; i<param.length; i++) {
				System.out.println("입력" + (i+1) + " = " + param[i]);
			}
		}
		
		
		
	}
}
