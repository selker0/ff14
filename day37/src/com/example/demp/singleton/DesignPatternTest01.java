package com.example.demp.singleton;

import lombok.*;
// 프로그래밍 방법론의 목적 : 생산성 < 재사용 < 부품

// 클래스 : 관련된 데이터를 모아 + 생성자 + 메소드

// 반복해서 발생하는 문제 상황 > 해결책 : DesignPattern
@AllArgsConstructor
@Builder
	class 고객 {
		String name;
		String tel;
		String address;
		String cardNo;
		}
public class DesignPatternTest01 {
	public static void main(String[] args) {
		// 객체 생성이 난해하다 > 문제상황 > builder
		고객 ob1 = new 고객("홍길동","010-1111-2222","미추홀구 학익동","1234");
		고객 ob2 = 고객.builder().address("학익동").tel("010-1111-2222").name("홍길동").cardNo("1234").build();
		
		// 생성자의 난해함 : 고객의 이름밖에 모른다면
		고객 ob3 = new 고객("전우치",null,null,null);
		고객 ob4 = 고객.builder().name("전우치").build();
	}
}
