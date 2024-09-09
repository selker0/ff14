package com.example.board.entity;

import java.time.LocalDate;

import lombok.*;

// Value Object : 값을 저장하는 객체
// entity : 데이터베이스에 저장될 객체

// 값을 저장하는 객체 : VO, Entity, DTO(Data Transfer Object)

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
	private String username;
	@Setter
	private String password;
	@Setter
	private String email;
	private LocalDate birthday;
	private LocalDate joinday;
	
}