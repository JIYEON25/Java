package chapter06;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() { }
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
	
}

public class Ex35_constructor {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
