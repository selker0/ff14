package com.example.demc;

/*
	1.자바는 객체 언어이다
	- 파이썬, JS도 모든 것이 객체였는데....
	- JS에서 객체를 만드는 방법
		const obj = {irum : "홍길동"};	// 설계도 X > 검증 불가, 간편
		const d = new Data();			// 설계도를 가지고 객체를 찍어낸다
		
	- 자바는 무조건 클래스를 만들어야 한다
	
	2. 자바가 나오던 시절(1995년)은 객체 언어가 한창 보급되던 시절
	- 자바는 무조건 객체를 사용하게 하고 싶어
	- 야 모든 함수는 메소드다
	
	3. 자바이전의 언어들에는 프로그램을 시작하는 main 함수가 따로 있었다
	- 모든 함수는 메소드다 > main도 메소드 > 클래스를 만들어야 한다
	
	4. 접근제한 : public - private - protected(자식은 접근가능)
*/

public class Example1 {
	public static void main(String[] args) {
		// 키워드 1 : public
		// 키워드 2 : class
		// 키워드 3 : static - 설명 불가
		// 키워드 4 : void
		// 	자바는 강타입 언어 > 항상 타입을 적어야 한다
		//	def sum(a,b) > return 값이 뭐다? 알 수 없다
		// 	void는 값이 없다
		System.out.print("Hello Java");
	}
}