package jy.java.exam11;

import java.io.File;

public class FileEx02 {
	public static void main(String[] args) {
		File directory = new File("c:/myProject/");
		if(directory.exists()){
			if(directory.isDirectory()){
				//현재 디렉토리내의 모든 파일 디렉토리의 이름 얻기
				String[] fileNameList = directory.list();
				for(String fileName : fileNameList){
					File myFile = new File(directory, fileName);
					if(myFile.isFile()) {
						System.out.println("파일 이름 : " + myFile.getName() 
						+ ", 파일크기 : " + myFile.length() + "byte");
					}else { 
						System.out.println("폴더 이름 : " + myFile.getName());
					}
				}//end for
			}
		}// end if

	}
}
