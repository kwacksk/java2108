package com.examplechapter04;

public class CF_RandomNumber {

	public static void main(String[] args) {
		// random number �����ϱ�
		// Math Ŭ������ random()�Լ��� ����Ѵ�.
		// random()�Լ��� 0~1 �̸��� �Ǽ����·� ������ �߻���Ų��.
		//double rnumber = Math.random()*10;
		//int rnumber = (int)(Math.random()*100);
		int rnumber = (int)(Math.random()*100)%45+1;
		System.out.println(rnumber);
		

	}

}
