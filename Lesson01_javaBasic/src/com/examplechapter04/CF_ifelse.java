package com.examplechapter04;

import java.util.Scanner;

public class CF_ifelse {

	public static void main(String[] args) {
		// if else 제어구문 설명
		// if 조건식{} else{}
		Scanner input = new Scanner(System.in);
		// 생년입력
		int birthYear = input.nextInt();
		
		//나이계산
		int age =  2021 - birthYear;
	
		//계산된 나이가 20보다 작으면
	if(age < 20) {System.out.println("미성년자네요");
	System.out.println("안녕하가세요");
	}else {System.out.println("어서오세요");
	System.out.println("반갑습니다.");
	}
		//그렇지 않으면
	}

}
