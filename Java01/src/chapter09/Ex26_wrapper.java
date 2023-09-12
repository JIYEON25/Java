package chapter09;

public class Ex26_wrapper {
	public static void main(String[] args) {
		Integer i = 100;
		Integer i2 = 100;
		
		System.out.println(i == i2);
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		System.out.println(i.toString());
		System.out.println();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.TYPE);
		
	}
}
