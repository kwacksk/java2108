package com.examplechapter04;

import java.util.Scanner;

public class CF_Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//��ǻ�Ͱ� ���� ��, ���� ���� ����ϱ� ���� ������ ���� �����Ѵ�.
		int computernumber, Gamernumber;
		string winnder="", losee="";
		//��ǻ���� ���� 1~3 ���� �� �ϳ��� ���Ƿ� �����Ѵ�.
		computernumber = (int)(Math.random()*10)%3 + 1;
		System.out.println("1=����,2=����, 3=��  �� �ϳ��� �����ϼ���" );
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
					System.out.println("�߸� �����߽��ϴ�.");
					break;
					
		}
		System.out.println("winner : %s, loser : %s\n",winner,loser);
		
		
	}

}
