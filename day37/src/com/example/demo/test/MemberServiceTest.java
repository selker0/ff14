package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.example.board.entity.Member;
import com.example.demo.service.*;

import com.example.demo.service.MemberService;

public class MemberServiceTest {
	// @Test
	public void 아이디중복확인Test() {
		assertEquals(true, MemberService. 아이디중복확인("spring"));
		assertEquals(true, MemberService. 아이디중복확인("winter"));
	}
	
	// @Test
	public void 이메일중복확인Test() {
		assertEquals(true, MemberService. 아이디중복확인("spring@naver.com"));
		assertEquals(true, MemberService. 아이디중복확인("winter@naver.com"));
	}
	public void loginTest() {
		// 실패 : 비밀번호가 틀린 경우, 아이디가 없는 경우
		assertEquals(true,MemberService.login("winter", "1111"));
		assertEquals(false,MemberService.login("winter", "1234"));
		assertEquals(false,MemberService.login("spring", "1111"));
	}
	public void checkPasswordTest() {
		// 실패 : 비밀번호가 틀린 경우(아이디는 로그인 아이디. 아이디가 없는 경우가 없다.)
		assertEquals(true,MemberService.checkPassword("winter", "1111"));
		assertEquals(false,MemberService.checkPassword("winter", "1234"));
		assertEquals(false,MemberService.checkPassword("spring", "1111"));
	}
	@Test
	public void readTest() {
		 //Member 객체의 값을 assert 할 수가 없으니까 필드값을 검증
		assertEquals("winter",MemberService.read("winter").getUsername());
		
		// 또는 로그인한 사용자 정보를 읽어오면 null이 아니라는 것을 체크
		assertNotNull(MemberService.read("winter"));
		System.out.println(MemberService.read("winter"));
	}
	public void updateTest() {
		MemberService.update("winter", "1234", "winter@daum.net");
		Member member = MemberService.read("winter");
		assertEquals("winter@daum.net",member.getEmail());
	}
}
