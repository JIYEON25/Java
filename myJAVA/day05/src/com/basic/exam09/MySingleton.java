package com.basic.exam09;

/**
 * Singleton Pattern
 * 	- GOF's Design Pattern : 생성*5, 구조*7, 행위*11? 총 23개
 * 		- 'https://4z7l.github.io/2020/12/25/design_pattern_GoF.html'
 * 	- 디자인 패턴
 *  	- 모듈의 세분화된 역할이나 모듈들 간의 인터페이스 구현 방식을 설계할 때 참조할 수 있는 전형적인 해결 방식
 *  	- 한 패턴에 변형을 가하거나 어떠한 요구사항을 반영하면 다른 패턴으로 변형되는 특징이 있습니다.
 *  	- 서브시스템에 속하는 컴포넌트들끼리의 관계를 설계하기 위한 참조 모델입니다.
 *	- 아키텍처 패턴
 *		- 디자인 패턴의 상위 수준 설계에 사용합니다.
 *		- 전체 시스템의 구조를 설계하기 위한 참조 모델입니다.		
 */
public class MySingleton {
	// 멤버 필드
	private static MySingleton instance;
		// 3) static으로 작성하는 경우 : 클래스 이름으로 접근할 수 있습니다.
		// 4) private으로 작성하는 경우 : 외부에서 접근할 수 없습니다.
	
	// 생성자
	private MySingleton(){
		// 1) public으로 작성하는 경우 : new로 생성해야 합니다.
		// 2) private으로 작성하는 경우 : 외부에서 접근할 수 없습니다.
	}
	
	// 메소드
	public static MySingleton getInstance() {
		// 5) 객체를 생성할 수 없습니다.
		// 6) static으로 작성하는 경우 : 객체를 생성할 수 있습니다.
		
		/*
		instance = new MySingleton();
		return instance;
		 */
		
		// 7) 항상 객체를 생성하지 않도록 작성합니다.
		if(instance == null) {
			// 클래스를 건드릴 수 없도록 잠가버립니다.
			synchronized (MySingleton.class) {
				instance = new MySingleton();
			}
			// 객체가 생성된 이후에는 새로 객체를 생성하지 않고 이미 존재하는 객체를 사용합니다.
		}
		return instance;
	}
}
