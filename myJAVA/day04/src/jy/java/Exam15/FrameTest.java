package jy.java.Exam15;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest extends Frame {
	
	private static final long serialVersionUID = 1L;
	
	public FrameTest() {
		super("FrameTest");
		addWindowListener(new MyEvent());
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyEvent extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("종료");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new FrameTest();
	}
}
