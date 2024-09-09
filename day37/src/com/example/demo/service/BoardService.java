package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.example.board.entity.*;

public class BoardService {
	// 싱글톤 만들기
	private static BoardService service = new BoardService();
	private BoardService() {
		for(int i=0; i<10; i++) {
			boards.add(0,new Board(bno++, i+"번째글", "내용없어요", "spring", LocalDateTime.now(),0));
		}
	}
	
	public static BoardService getInsrance() {
		return service;
	}
	
	// Board를 저장할 ArrayList를 만들자(DB대체)
 	private ArrayList<Board> boards = new ArrayList<>();
 	private long bno = 1;
 	
 	// 글목록, 작성, 읽기, 변경, 삭제(CRUD)
 	public ArrayList<Board> list(){
 		return boards;
 	}
 	
 	public boolean write(Board board, String loginId) {
 		// 사용자가 입력한 board안에는 제목, 내용
 		boards.add(0, board.init(bno++, loginId));
 		return true;
 	}
 	
 	public Board read(long bno) {
 		for(Board b:boards) {
 			if(b.getBno()==bno)
 				return b.increseReadCnt();
 		}
 		return null;
 	}
 	
 	public boolean update(long bno, String title, String content) {
 		for(Board b:boards) {
 			if(b.getBno()==bno) {
 				b.update(title,content);
 				return true;
 			}
 		}
 		return false;
	}
 	public boolean delete(long bno) {
 		for(int i=0; i<boards.size(); i++) {
 			if(boards.get(i).getBno()==bno) {
 				boards.remove(i);
 				return true;
 			}
 		}
 		return false;
 	}
 }
