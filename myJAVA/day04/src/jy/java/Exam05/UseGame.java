package jy.java.Exam05;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("마린의 위치 이동 좌표는 x : " + x + ", y : " + y + "입니다.");
	}
	@Override
	void stop() {
		System.out.println("마린이 대기 상ㅌ애에 있습니다.");
	}
	@Override
	void message() {
		System.out.println("Message:: Standing back.");
	}
	void stimPack() {
		System.out.println("마린이 스팀팩을 사용합니다.");
	}
	
}

class SiegeTank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! SiegeTank => x : " + x + ", y : " + y);
	}
	@Override
	void stop() {
		System.out.println("Destination?");
	}
	@Override
	void message() {
		System.out.println("Message:: Go, Siege!");
	}
	void changeMode() {
		System.out.println("Yes, Sir!");
	}
	
}
class Dropship extends Unit { 
	
	@Override
	void move(int x, int y) {
		System.out.println("Take it slow. Droshp => x : " + x + ", y : " + y);
	}
	@Override
	void stop() {
		System.out.println("In the by, by, by, by");
	}
	@Override
	void message() {
		System.out.println("Message:: Can I take orders?");
	}
	
}

public class UseGame {
	public static void main(String[] args) {
		Unit[] ref = new Unit[3];
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
		for(int i=0; i<ref.length; i++) {
			System.out.println("========================");
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("========================");
		}
	}
}
