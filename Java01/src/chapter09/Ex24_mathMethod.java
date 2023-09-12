package chapter09;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Ex24_mathMethod {
	public static void main(String[] args) {
		double val = 90.7552;
		
		out.println(round(val));	//반올림
		
		val *= 100;
		out.println(round(val));	//반올림
		
		out.println(ceil(1.1));		//올림
		out.println(floor(1.5));	//내림
		out.println(round(1.1));	//반올림
		out.println(round(1.5));	//반올림
		out.println(rint(1.5));		//반올림
		out.println(round(-1.5));	//반올림
		out.println(rint(-1.5));	//반올림
		out.println(ceil(-1.5));	//올림
		out.println(floor(-1.5));	//내림
		
	}
}
