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
//System.out.println("1���� 10������ ��:"+sum);
		Scanner input = new Scanner(System.in);
		int jobNumber = 999;
		do {
			System.out.println("1.�ڷ����");
			System.out.println("2.�ڷ���ȸ");
			System.out.println("3.�ڷ����");
			System.out.println("4.�ڷ����");
			System.out.println("0.���α׷�����");
			
			System.out.println("�۾��� �����ϼ���");
			jobNumber = input.nextInt();
					System.out.println("�۾���ȣ : " +jobNumber);
		}
		while(jobNumber !=0);
		System.out.println("���α׷�����...");
			
			
			}

}
