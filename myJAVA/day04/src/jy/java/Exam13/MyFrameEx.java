package jy.java.Exam13;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyEvent extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료");
		System.exit(0);
	}
}

public class MyFrameEx {
	public static void main(String[] args) {
		Frame myFrame = new Frame();
		myFrame.addWindowListener(new MyEvent());
		myFrame.setSize(300,200);
		myFrame.setVisible(true);
	}
}
