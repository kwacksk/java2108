package com.examle.chapter06;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	
	}
	
	public void printThis() {
		System.out.println(this); //�ν��Ͻ�(��ü) �ڽ��� �ּҰ�
	}

}//end of class Birthday
// ���ϸ�� ������ This Example Ŭ����
public class Thisexample {

	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		

	}//end of main()

}//end of class ThisExample
