package jy.java.exam12;

import java.io.File;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) throws IOException {
		//파일 생성
		File f1 = new File("c:/myProject/newFile.txt");//빈 파일이 만들어짐
		if(f1.exists()){
			System.out.println("파일이름:"+f1.getName());
		} else {
		//IOException 발생
		if(f1.createNewFile()){
			System.out.println("새로운 파일을 만들었습니다.");
			}
		}
		//디렉토리 생성
		File f2 = new File("c:/myProject/newDirectory");
		if(!f2.exists()){
			if(f2.mkdir())
			System.out.println("새로운 폴더를 만들었습니다.");
		}else{
			System.out.println("디렉토리 이름:"+f2.getPath());
		}
		//파일 혹은 디렉토리 삭제
		File f3 = new File("c:/myProject/hello.txt");
		if(f3.exists()){
			if(f3.delete()) {
				System.out.println("hello.txt 파일을 삭제하였습니다.");
			}
		}else {
			System.out.println("hello.txt 파일이 존재하지않습니다.");
		}
		//파일 혹은 디렉토리 이름 변경
		File src = new File("c:/myProject/newFile.txt");
		File dest = new File("c:/myProject/newDirectory/dest.txt");
		File dest2 = new File("c:/myProject/newDirectory/desc2.txt");

		if(src.exists()){
			if(src.renameTo(dest)) 
				System.out.println("dest.txt파일로 이동성공");
			if(src.renameTo(dest2)) 
				System.out.println("dest.txt파일로 이동성공");
			}
			if(f2.isDirectory()){ // 디렉토리의 목록을 출력함. 
				String dir[] = f2.list();
				System.out.println("\n\n Dir Content:============\n");
				for(String dirs : dir){
					System.out.println("dirs : "+dirs);
				}
			}

		
		
	}

}
