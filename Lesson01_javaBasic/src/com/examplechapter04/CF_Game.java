package com.examplechapter04;

import java.util.Scanner;

public class CF_Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//컴퓨터가 내는 수, 내는 수를 기억하기 위한 변수를 각각 선언한다.
		int computernumber, Gamernumber;
		string winnder="", losee="";
		//컴퓨터의 수를 1~3 숫자 중 하나를 임의로 결정한다.
		computernumber = (int)(Math.random()*10)%3 + 1;
		System.out.println("1=가위,2=바위, 3=보  중 하나를 선택하세요" );
		Scanner input = new Scanner(System.in); 
		Gamernumber = input.textlnt();
		
		swich(Gamernumber){
			case 1:
				if(computernumber == 1{
					winner = "same";
					loser = "same";
				}else if (computernumber ==2) {
					winner = "computer";
					loser = "gamer";
				}else {
					winner = "gamer";
					loser =  "computer";
					}
				break;
				default:
					System.out.println("잘못 선택했습니다.");
					break;
					
		}
		System.out.println("winner : %s, loser : %s\n",winner,loser);
		
		
	}

}
