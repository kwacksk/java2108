package com.examplechapter04;

import java.util.Scanner;

public class BasicInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻ ��¹�
		// println() : ���δ����� ���
		//print()
		//printf()
		int a =10, b = 20;
		System.out.println("Hello");
		System.out.println("Hello" + "Java");
		
		System.out.print(a);
		System.out.print(",");
		System.out.print(b);
		System.out.print("\n");
		System.out.print("korea\n");
		
		//�⺻�Է�
		Scanner read = new Scanner(System.in);
		System.out.println("�����͸� �Է����ּ���");
		int data = read.nextInt();
		System.out.println(data);
	}

}
