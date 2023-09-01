package com.basic.exam12;

/**
 * System 메소드
 * 		- System.in.read()
 * 		- System.currentTimeMillis()
 * 		- System.exit(int status) : 종료 
 * 			[0: 개발자가 의도한 종료, 1: 다른 값으로 인한 종료_개선 사항, -1: 에러로 인한 종료 ]
 * 		- System.gc() : GarbageCollection
 */	
public class SystemEx {
	public static void main(String args[]){
		long startLoopTime = System.currentTimeMillis();
		for( int i=0; i<1000000; i++){
			for( int j=0; j<100 ; j++){
				int k= i * j;
			} 
		}
		
		long ttime = System.currentTimeMillis ()- startLoopTime;
		System.out.println( " runtime : "+ttime +"m sec" );
			/*
			 	runtime : 3m sec
			 */
		
		/*
		System.in.read()
		System.in.read(byte[])
			- 입력을 받아 byte[] 배열에 저장합니다.
		System.in.read(byte[], int start, int length)
			- 입력을 받아 byte[] 배열에 start 위치에서부터 length 길이만큼 저장합니다.
		 */
		byte buffer[] = new byte[255];
		System.out.println("\nType a line of text: ");
		
		try { 
			System.in.read(buffer, 0, 255); // 255자가 안되는 경우 스베이스바로 처리됩니다.
		}
		catch (Exception e) { 
			System.out.println(e.toString());
		}
		
		System.out.println( new String( buffer ) ); 
			// byte[] > String >> String()
			// String > byte[] >> str.getBytes()
	 }
}
