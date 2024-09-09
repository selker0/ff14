package com.example.demc;

// 타입 : 처리 할 수 있는 값의 종류

// 기본타입 8개(bt)
// 1. 정수 : byte(1) short(2) int(4) long(8)
//			정수는 일정한 범위의 정확한 값 저장 - 크기가 커지면 저장 범위가 늘어난다
//			int는 -21억~21억
// 2. 실수 : float(4) double(8)
// 			실수는 근사값을 저장 - 크기가 커지면 정밀해 진다
// 3. 문자 : char(2)
// 4. boolean(1)

// 나머지는 참조타입

public class Example3 {
	public static void main(String[] args) {
		// JS의 기본타입은 number, string, boolean
		// a=10
		
		// 자바의 기본타입은 정수, 실수, 문자, boolean
		int a = 10;
		long b = 20;
		
		// 코드에 값을 직접 적는 것 : literal
		var x = 1000000000;
		long y = 3000000000L;
	}
}
