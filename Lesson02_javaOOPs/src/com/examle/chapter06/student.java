package com.examle.chapter06;

public class student {
	public String studentName;
	public int grade;
	public int money;
	

	public student(String studentName,int money) {
		this.studentName = studentName;
		this.money = money;
		
	}
	
	//������ Ÿ��
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.money += 1500;
	}
	public void takeOffBus(Bus bus) {
		
		this.money -= 1500;
	}
	public void showInfo() {
		System.out.println(studentName + "���� ���� �ܾ� : "+ money + "�Դϴ�");
	}
}
