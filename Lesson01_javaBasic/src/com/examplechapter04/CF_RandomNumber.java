package com.examplechapter04;

public class CF_RandomNumber {

	public static void main(String[] args) {
		// random number 생성하기
		// Math 클래스의 random()함수를 사용한다.
		// random()함수는 0~1 미만의 실수형태로 난수를 발생시킨다.
		//double rnumber = Math.random()*10;
		//int rnumber = (int)(Math.random()*100);
		int rnumber = (int)(Math.random()*100)%45+1;
		System.out.println(rnumber);
		

	}

}
