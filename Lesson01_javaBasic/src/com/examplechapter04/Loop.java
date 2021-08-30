package com.examplechapter04;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int sum = 0;
	//	int number = 1;
	//	while(number <=10) {
	//		sum += number;
	//		number++;
	//	}
//System.out.println("1부터 10까지의 합:"+sum);
		Scanner input = new Scanner(System.in);
		int jobNumber = 999;
		do {
			System.out.println("1.자료삽입");
			System.out.println("2.자료조회");
			System.out.println("3.자료수정");
			System.out.println("4.자료삭제");
			System.out.println("0.프로그램종료");
			
			System.out.println("작업을 선택하세요");
			jobNumber = input.nextInt();
					System.out.println("작업번호 : " +jobNumber);
		}
		while(jobNumber !=0);
		System.out.println("프로그램종료...");
			
			
			}

}
