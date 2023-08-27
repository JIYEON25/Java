package jy.java.Exam16;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	
	private static final long serialVersionUID = 1L;
	
	public MyFrame() {
		super("익명이너클래스");
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) { //MyFrame$1.class
				System.exit(0);
			}
			
		});
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
}
