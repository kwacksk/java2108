package com.examle.chapter06;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	
	}
	
	public void printThis() {
		System.out.println(this); //인스턴스(객체) 자신의 주소값
	}

}//end of class Birthday
// 파일명과 동일한 This Example 클래스
public class Thisexample {

	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		

	}//end of main()

}//end of class ThisExample
