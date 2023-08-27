package jy.java.exam23;

public class NewAccount extends Account {
	// member
	private String pw;
	// Constructor
	public NewAccount() { }
	public NewAccount(String name, String pw) {
		super(name);
		this.pw = pw;
	}
	//methods
	public boolean pwCheck(String pass) {
		if(pw.equals(this.pw)) { 
			return true;
		}else {
			return false;
		}
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
}
