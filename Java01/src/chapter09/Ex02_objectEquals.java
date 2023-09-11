package chapter09;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}

public class Ex02_objectEquals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1 is equal to v2");
		} else {
			System.out.println("v1 is not equal to v2");
		}
	}
}
