package jy.java.exam14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("c:\\myProject\\fileout.txt", true);
			// true 를 주면 이어씀.
			String message = "Hello FileOutputStream!!";
			fos.write(message.getBytes());	// String -> byte[]
			fos.close();	// 여기서 exception이 나와서 안닫힘. 그래서 밑에서 닫음.
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fos != null) fos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}

	
	
	}
}
