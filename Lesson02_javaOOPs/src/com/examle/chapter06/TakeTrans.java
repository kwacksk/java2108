package com.examle.chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		// �л��� ������ Ÿ�� �� ���踦 ǥ��
		//student hong = new student("�浿", 10000);
		//student chun =  new student("����", 50000);
		School mySchool = School.getInstance();
		School yourSchool = School.getInstance();
		School hisSchool	= School.getInstance();
		
		
		System.out.println(mySchool);
		System.out.println(yourSchool);
		System.out.println(hisSchool);
		
		//hong.showInfo();
		//chun.showInfo();
		
		//Bus bus700 = new Bus(700);
		//bus700.showInfo();
		//hong.takeBus(bus700);
		//chun.takeBus(bus700);
		//hong.showInfo();
		//chun.showInfo();
		//bus700.showInfo();
		//hong.takeOffBus(bus700);
		//hong.showInfo();
		//bus700.showInfo();
		
	}

}
