package com.examplechapter04;

import java.util.Scanner;

public class CalcCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//반지름 입력하라는 메시지 출력
		System.out.println("반지름을 입력하세요");
		//원의 면적 계산 : 반지름*반지름*3.14
		int r = input.nextInt();
		double a = r * r * 3.14;
		//계산된 원의 면적 출력
				System.out.println(a);
	
	}

}
