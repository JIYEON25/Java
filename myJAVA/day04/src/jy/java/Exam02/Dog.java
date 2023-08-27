package jy.java.Exam02;

public class Dog extends Animal {
	private String name;
	
	public Dog() {
		name = getClass().getSimpleName(); // = "Dog"
	}
	
	public String scream() {
		return "멍멍";
	}
	
	public String getName() {
		return name;
	}
	
	
}
