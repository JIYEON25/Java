package chapter09;

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	Person(long id) {
		this.id = id;
	}
	
}

public class Ex03_equalsOverriding {
	public static void main(String[] args) {
		
	
	Person p1 = new Person(8011081111222L);
	Person p2 = new Person(8011081111222L);
	
	if(p1.equals(p2)) {
		System.out.println("they are the same person");
	} else {
		System.out.println("they are different person");
	}
	}
}
