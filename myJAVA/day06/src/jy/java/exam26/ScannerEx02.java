package jy.java.exam26;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
		scan = new Scanner(new File("c:\\myProject\\scan.txt"));
			while (scan.hasNextDouble()) {
				System.out.printf("스캔 double : %,.2f %n", scan.nextDouble());
			}
			scan.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (scan != null) 
				scan.close();
		}

		
	}

}
