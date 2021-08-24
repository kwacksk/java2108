package com.examplechapter04;

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("가로 넓이를 입력하세요");
		int width = input.nextInt();
		System.out.println("세로 넓이를 입력하세요");
		int heiht = input.nextInt();
		int a = width;
		int b = heiht;
		int result = a * b;
		System.out.println(result);
		
		
	}

}
