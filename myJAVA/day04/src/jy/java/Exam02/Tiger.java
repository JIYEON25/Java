package jy.java.Exam02;

public class Tiger extends Animal{
	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName(); 
	}
	
	public String scream() {
		return "어흥";
	}
	
	public String getName() {
		return name;
	}
}
