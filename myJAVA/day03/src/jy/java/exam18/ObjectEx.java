package jy.java.exam18;

public class ObjectEx {
	private String name;
	private int price;
	
	public ObjectEx(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		ObjectEx test1 = new ObjectEx("1", 1);
		ObjectEx test2 = new ObjectEx("1", 1);
		System.out.println("test1 ? " + test1);
		System.out.println("test2 ? " + test2);
		System.out.println("test1 hashcode ? " + test1.hashCode());
		System.out.println("test2 hashcode ? " + test2.hashCode());
		System.out.println("test1/test2 same ? " + test1.equals(test2));
		
	}
}
