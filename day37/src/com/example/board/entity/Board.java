package com.example.board.entity;

import java.time.*;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	private long bno;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime writeTime;
	private long readcnt;
	
	public Board init(long bno, String loginId) {
		this.bno = bno;
		this.writer = loginId;
		this.writeTime = LocalDateTime.now();
		this.readcnt = 0;
		return this;
	}
	
	public void update(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public Board increseReadCnt() {
		this.readcnt++; // 읽음수를 증가시킴
	return this;
	}
}
