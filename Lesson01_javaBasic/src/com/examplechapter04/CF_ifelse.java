package com.examplechapter04;

import java.util.Scanner;

public class CF_ifelse {

	public static void main(String[] args) {
		// if else ����� ����
		// if ���ǽ�{} else{}
		Scanner input = new Scanner(System.in);
		// �����Է�
		int birthYear = input.nextInt();
		
		//���̰��
		int age =  2021 - birthYear;
	
		//���� ���̰� 20���� ������
	if(age < 20) {System.out.println("�̼����ڳ׿�");
	System.out.println("�ȳ��ϰ�����");
	}else {System.out.println("�������");
	System.out.println("�ݰ����ϴ�.");
	}
		//�׷��� ������
	}

}
