package com.basic.exam07;

/**
 * Math class
 */
public class MathEx {
	public static void main(String[] args) {
		
		double da;
		
		// pow(a, b) : a^b 제곱 연산
		da = Math.pow(2, 3); 
		System.out.println( "2^3 : Math.pow(2, 3) ="+da );
			/*
				2^3 : Math.pow(2, 3) =8.0
			 */
		
		// 최대값
		da = Math.max( 300f , 301.0 );
		System.out.println( "Math.max( 300f , 301.0 ) : "+da );
			/*
				Math.max( 300f , 301.0 ) : 301.0
			 */
		
		// 최소값
		da = Math.min( 300f , 301.0 );
		System.out.println( "Math.min( 300f , 301.0 ) : "+da );
			/*
				Math.min( 300f , 301.0 ) : 300.0
			 */
		
		// abs() : 절댓값 반환
		da = Math.abs( -1234.1 );
		System.out.println( "Math.abs( -1234.1 ) : "+da );
		da = Math.abs( +1234.1 );
		System.out.println( "Math.abs( +1234.1 ) : "+da );
			/*
				Math.abs( -1234.1 ) : 1234.1
				Math.abs( +1234.1 ) : 1234.1
			 */
		
		// random() : 0.0 - 1.0 사이 임의의 double형 데이터 반환
		da = Math.random();
		System.out.println( "Math.random() : "+da );
		da = Math.random();
		System.out.println( "Math.random() : "+da );
			/*
				Math.random() : 0.6863899665339681
				Math.random() : 0.7644608727173546
			 */
		
		// sqrt() : 제곱근 반환
		da = Math.sqrt( 90000 ) ;
		System.out.println( "Math.sqrt( 90000 ) : "+da );
			/*
				Math.sqrt( 90000 ) : 300.0
			 */
		
		// round() : 소수점 첫번째 자리에서 반올림한 결과
		long dda = Math.round(123.56);
		System.out.println( "Math.round(123.56) : "+dda );
		dda = Math.round(123.46);
		System.out.println( "Math.round(123.46) : "+dda );
			/*
				Math.round(123.56) : 124
				Math.round(123.46) : 123
			 */
		
		// ceil(a) : a보다 큰 정수중 가장 작은 정수 반환
		da = Math.ceil(123.56);
		System.out.println( "Math.ceil(123.56) : "+da );
		da = Math.ceil(123.46);
		System.out.println( "Math.ceil(123.46) : "+da );
			/*
				Math.ceil(123.56) : 124.0
				Math.ceil(123.46) : 124.0
			 */
		
		// floor(a) : a보다 작은 정수 중 가장 큰 정수 반환
		da = Math.floor(123.56);
		System.out.println( "Math.floor(123.56) : "+da );
		da = Math.floor(123.46);
		System.out.println( "Math.floor(123.46) : "+da );
			/*
				Math.floor(123.56) : 123.0
				Math.floor(123.46) : 123.0
			 */
		
		// rint() : 소수 첫번째 자리에서 반올림
		da = Math.rint(123.56);
		System.out.println( "Math.rint(123.56) : "+da );
		da = Math.rint(123.46);
		System.out.println( "Math.rint(123.46) : "+da );
			/*
				Math.rint(123.56) : 124.0
				Math.rint(123.46) : 123.0	
			 */
		
		da = Math.sin(45);
		System.out.println( "Math.sin(45) : "+da );
			/*
				Math.sin(45) : 0.8509035245341184
			 */
		
		// Math.toRadians() : 일반 각에 대한 라디안 값 반환 (1 라디안 = 57.3도)
		int degrees = 60;
		da = Math.toRadians(degrees);
		System.out.println( "Math.toRadians(60)="+da );
			/*
				Math.toRadians(60)=1.0471975511965976
			 */
		
		double radians = ((double)degrees/180.0) * Math.PI;
		System.out.println( "radians (60)="+radians );
			/*
				radians (60)=1.0471975511965976
			 */
		
		// Math.toDegrees(radians) : 라디안 값을 degree로 계산하여 반환
		da = Math.toDegrees(radians);
		System.out.println( "Math.toDegrees(radians)="+da );
			/*
				Math.toDegrees(radians)=59.99999999999999
			 */
		
		// PI 라는 원주율
		da = Math.PI;
		System.out.println( "Math.PI="+da ); 
			/*
				Math.PI=3.141592653589793
			 */
		
		// e 라는 자연로그상수
		da = Math.E;
		System.out.println( "Math.E="+da ); 
			/*
				Math.E=2.718281828459045
			 */
	}
}
