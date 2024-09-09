package com.example.demo1;

// 목표 : 생산성 < 재사용
// 재사용 방법 : 함수 > 클래스 > 빌드도구(의존성)
// 클래스는 서로 관련된 데이터와 그 데이터를 다루는 함수의 집합

class Student {
	// 클래스의 멤버 변수 : 필드(field)
	String name;
	long nai;
	String school;
	
	// 생성자 : 객체 초기화 전용 메소드
	Student(String name, long nai, String school){
		this.name = name;
		this.nai = nai;
		this.school = school;
	}
	
	// 함수는 파라미터가 다르면 이름이 같아도 상관없다 - 오버로딩
	Student(){
		// 파라미터 없는 생성자 - 기본 생성자(default constuctor)
		// 스프링이 사용
	}
	
	// 메소드
}

public class Example01 {
	public static void main(String[] args) {
		Student s = new Student("홍길동",20,"학익대학교");
	}
}
