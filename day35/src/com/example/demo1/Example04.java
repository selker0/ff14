package com.example.demo1;

//접근제한
// public, private, protected, package(생략. 같은 패키지면 접근가능)

class 사각형 {
	private long 너비;
	private long 높이;
	public 사각형(long 너비, long 높이){
		this.너비 = 너비;
		this.높이 = 높이;
	}
	public long get너비() {
		return 너비;
	}
	public void set너비(long 너비) {
		this.너비 = 너비;
	}
	public long get높이() {
		return 높이;
	}
	public void set높이(long 높이) {
		this.높이 = 높이;
	}
}

public class Example04 {
	public static void main(String[] args) {
	}
}
