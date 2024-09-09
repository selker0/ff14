package com.example.demc;

// 산술연산
public class Example12 {
	public static void main(String[] args) {
		System.out.println(3+5);	// 8
		
		// +연산을 문자열이 오면 문자열 합치기
		System.out.println("3"+5);	// "35"
		
		int a = 1124;
		// a를 문자열로 변환
		System.out.println(a+"");
		
		// 산술연산을 할 때 같은 타입을 연산하면 결과도 그 타입
		System.out.println(5/3);	// 1
		System.out.println(5/3.0);	
	}
}
