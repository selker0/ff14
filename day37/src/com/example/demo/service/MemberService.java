package com.example.demo.service;

import java.time.LocalDate;
import java.util.*;

import org.mindrot.jbcrypt.BCrypt;

import com.example.board.entity.*;
// 간단하고 유용한 자바 클래스들의 모임
// list : ArrayList, Vector		배열
// tuple : X
// set : set(순서가 없으며 중복 불가능)
// dictionary : Map(키와 값의 쌍)	객체

public class MemberService {
	// 아이디 중복 확인, 이메일 중복 확인, 회원가입, 로그인, 비밀번호 확인, 내정보 보기, 내정보 변경
	
	// 파이썬의 리스트, 자바스크립트의 배열 - 자료 집합 클래스(java.util.*)
	private static ArrayList<Member> members = new ArrayList<>();
	
	static {
		members.add(new Member("fall",BCrypt.hashpw("1111",BCrypt.gensalt()), "Fall@naver.com", LocalDate.of(2000, 1, 1), LocalDate.now()));
		members.add(new Member("winter",BCrypt.hashpw("1111",BCrypt.gensalt()), "winter@naver.com", LocalDate.of(2000, 1, 1), LocalDate.now()));
	}
		
	public static boolean 아이디중복확인(String username) {
		// 향상된 for
		for(Member m:members) {
			if(m.getUsername().equals(username))
				return false;
		}
		return true;
	}
	public static boolean 이메일중복확인(String email) {
		for(Member m:members) {
			if(m.getEmail().equals(email))
				return false;
		}
		return true;
	}
	public static boolean 회원가입(Member member) {
		// 비밀번호 암호화
		// 암호화(encryption) - 복호화가능
		// hash - 복호화 불가능
		String hashPassword = BCrypt.hashpw(member.getPassword(),BCrypt.gensalt());
		member.setPassword(hashPassword);
		members.add(0,member);
		return true;
	}
	
	// 아이디와 패스워드가 존재하는가?
	// 사용자가 비로그인 상태 > 아이디와 비밀번호를 입력
	public static boolean login(String username, String password) {
		for(Member m:members) {
			if(m.getUsername().equals(username)) {
				BCrypt.checkpw(password, m.getPassword());
			}
		}
		return false;
	}
	
	// 비밀번호가 일치하는가?
	public static boolean checkPassword(String loginID, String password) {
		for(Member m:members) {
			if(m.getUsername().equals(loginID)) {
				BCrypt.checkpw(password, m.getPassword());
			}
		}
		return false;
	}
	public static Member read(String loginID) {
		for(Member m:members) {
			if(m.getUsername().equals(loginID))
				return m;
		}
		return null;
	}
	public static boolean update(String loginId, String password, String email){
		for(Member m:members) {
			if(m.getUsername().equals(loginId)) {
				String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt());
				m.setPassword(hashPassword);
				m.setEmail(email);
				return true;
			}
		}
		return false;
	}
}
