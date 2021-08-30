package com.example.chap05;

public class student_Test {

	public static void main(String[] args) {
		// Student1 클래스를 이용하여 객체 생성
		//객체 생성 : 
		//new 클래스생성자();
		//객체참조변수
		Student1 hong = new Student1(); //클래스생성자 :  클래스이름()
		System.out.println(hong);
		hong.studentName = "홍길동";
		hong.address = "청주";
		hong.showStudentInfo();
		


	}

}
