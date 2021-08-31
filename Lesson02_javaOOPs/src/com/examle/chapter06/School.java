package com.examle.chapter06;

public class School {
	//2. 클래스 내부에서 static 으로 유일하게 생성한 인스턴스 생성
	private static School instance = new School();
	//1.생성자는 access modifier private 으로 한다.
	private School1() {
		//none operation
		//3.외부에서 참조할 수 있도록 public 메서드를 만든다.
		public static School getInstance() {
			if(instance == null) {
				instance = new School
			}
		}
	}

}
