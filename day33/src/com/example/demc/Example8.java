package com.example.demc;


public class Example8 {
	public static void main(String[] args) {
		// 컴퓨터는 이진수를 사용 > 컴퓨터는 정수만 저장할 수 있다
		// 0100 = 십진수로 4
		// 11011001 128+ 64+ 16+ 8+ 1+
		
		// 컴퓨터는 정수로 문자를 저장하는 약속을 정해야 한다 - ASCII 코드
		// '0' 48
		// 'A' 65
		// 'a' 97
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		System.out.println(ch+32);
		System.out.println((char)(ch+32));
	}
}
