package jy.java.exam12;

public class ThisEx {
	String name, jumin, tel;
	
	public ThisEx() { 
		this.name = "Guest";
		this.jumin = "000000-0000000";
		tel = "000-0000-0000";
	}
	
	public ThisEx(String name) {
		this();
		this.name = name;
	}
	
	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = jumin;
	}
	
	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}

	public String getTel() {
		return tel;
	}
	
	
	
}
