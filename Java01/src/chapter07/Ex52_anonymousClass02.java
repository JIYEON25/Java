package chapter07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}

public class Ex52_anonymousClass02 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}
