package com.example.demo1;

// 접근제한 : public, private, protected
// 객체지향구성요소 : 캡슐화, 정보은닉, 상속, 다향성

class TV2{
	// 캡슐화(encapsulation) - 클래스를 만들어라
	// 정보은닉(information hiding) - 가능한한 숨겨라
	private String company;
	private long year;
	private long inch;
	
	public TV2(String company, long year, long inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
}

public class Example03 {
	public static void main(String[] args) {
		TV2 tv = new TV2("LG",2020,75);
		
	}
}
