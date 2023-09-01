package com.basic.exam11;

/**
 * Runtime 클래스
 */
public class RuntimeEx {
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		// freeMemory() : 현재 JVM에서 사용할 수 있는 메모리_byte
		long fr = rt.freeMemory();
		System.out.println("FreeMemory : " + fr / 1024 + "KB");
			/*
				FreeMemory : 256083KB
			 */

		// totalMemory() : 전제 메모리_byte
		long tr = rt.totalMemory();
		System.out.println("TotalMemory : " + fr / 1024 + "KB");
			/*
				TotalMemory : 256083KB
			 */		
		
		try {
			// exec("실행 파일 경로") : 외부 명령어
			rt.exec("C:\\windows\\system32\\calc.exe");
			
			// 사용 가능
			rt.exec("C:\\windows\\system32\\calc.exe" + System.getProperty(""));
			
			rt.exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore");
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
