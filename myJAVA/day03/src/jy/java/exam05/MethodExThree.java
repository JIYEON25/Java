package jy.java.exam05;

public class MethodExThree {
	int var;

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
	
	public static void main(String[] args) {
		MethodExThree me = new MethodExThree();
		me.setVar(1000);
		System.out.println("var : " + me.getVar());
	}
	
	
}
