package chapter07;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Marine's location : " + x + ", " + y);
	}
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Tank's location : " + x + ", " + y);
	}
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Dropship's location : " + x + ", " + y);
	}
	void load() { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}

public class Ex34_abstractClass {

	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
	}

}
