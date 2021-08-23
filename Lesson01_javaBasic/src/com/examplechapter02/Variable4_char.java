package com.examplechapter02;

public class Variable4_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char myChar = 'A'; //  작은따옴표로 묶인 것은 문자
String yourStr = "Apple"; //큰따옴표로 묶은 것은 문자열.
System.out.println(myChar);// Char A를 출력
System.out.println(yourStr);// string A를 출력
//char 타입의 변수는 ascii로 출력할 수 있다.


System.out.println((int)myChar);
//char 타입에는 숫자연산이 가능하다.
int newChar = 66;
System.out.println((char)newChar);

for(int ch = 65; ch < 91;ch++)
	System.out.println((char)ch);

char ch1 = '한';
char ch2 = '\uD55C';
System.out.println(ch1);
System.out.println(ch2);
}

}
