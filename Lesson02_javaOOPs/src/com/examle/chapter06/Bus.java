package com.examle.chapter06;

public class Bus {
	int busNumber;
	int pssengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money+=money;
		pssengerCount++;
	}
		public void takeOff(int money) {
			this.money-=money;
			pssengerCount--;
		
	}
	public void showInfo() {
		System.out.println("버스 "+ busNumber+ "번의 승객은"+ pssengerCount+ "명이고, 수입은" +money+"입니다");
		
	}
}

