package com.examplechapter02;

public class Variable4_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char myChar = 'A'; //  ��������ǥ�� ���� ���� ����
String yourStr = "Apple"; //ū����ǥ�� ���� ���� ���ڿ�.
System.out.println(myChar);// Char A�� ���
System.out.println(yourStr);// string A�� ���
//char Ÿ���� ������ ascii�� ����� �� �ִ�.


System.out.println((int)myChar);
//char Ÿ�Կ��� ���ڿ����� �����ϴ�.
int newChar = 66;
System.out.println((char)newChar);

for(int ch = 65; ch < 91;ch++)
	System.out.println((char)ch);

char ch1 = '��';
char ch2 = '\uD55C';
System.out.println(ch1);
System.out.println(ch2);
}

}
