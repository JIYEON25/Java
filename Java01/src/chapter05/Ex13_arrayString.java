package chapter05;

public class Ex13_arrayString {

	public static void main(String[] args) {
		String[] names = {"Kim" ,"Park", "Lee"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"] : " + names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp : " + tmp);
		names[0] = "Yu";
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
