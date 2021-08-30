package com.example.chap05;

public class Student1 {
// member property
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	
	//member method 멤버 메서드
	//한정자 리턴 타입 메서드이름 (패러미터){}
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} // end of showStudentInfo()
}

