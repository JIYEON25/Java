package jy.java.Exam02;

public class Cat extends Animal{
private String name;
	
	public Cat() {
		name = getClass().getSimpleName(); // = "Cat"
	}
	
	public String scream() {
		return "야옹";
	}
	
	public String getName() {
		return name;
	}
}
