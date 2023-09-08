package chapter06;

public class Ex07_objectOriented {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1's channel : " + t1.channel);
		System.out.println("t2's channel : " + t2.channel);
		
		t1.channel = 7;
		System.out.println("t1's channel has been changed to " + t1.channel);
		
		System.out.println("t1's channel : " + t1.channel);
		System.out.println("t2's channel : " + t2.channel);
	}

}
