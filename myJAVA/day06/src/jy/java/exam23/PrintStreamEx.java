package jy.java.exam23;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try{
			fos = new FileOutputStream("c:/myProject/printStream.txt");
			bos = new BufferedOutputStream(fos);	//용량 기본으로 그냥 쓰세염.
			ps = new PrintStream(bos,true);			// 오토플러시. 근데 안줘도됨.
			ps.println("이승재"); ps.println(1234);
			ps.println(true); ps.println('a');
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
				if(ps != null) 
					ps.close();
			try {
				if(bos != null) 
					bos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			try {
				if(fos != null) 
					fos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
}
