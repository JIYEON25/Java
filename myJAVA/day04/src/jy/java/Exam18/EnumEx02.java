package jy.java.Exam18;

public class EnumEx02 {
	public enum Item {
		Add, Del, Search, Cancel
	}
	
	public static void main(String[] args) {
		Item a1 = Item.Search;
		if(a1 instanceof Object) {
			System.out.println(a1.toString() + "^^");
			System.out.println("OK! instanceof Object");
			System.out.println("");
		}
		
	}
	
}
