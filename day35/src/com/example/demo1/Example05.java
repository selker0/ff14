package com.example.demo1;

class Rect{
	private long 너비;
	private long 높이;
	public Rect(long 너비, long 면적) {
	this.너비 = 너비;
	this.높이 = 높이;
	}
	public long get너비(){
		return 너비;
	}
	public long set너비(long 너비) {
		return 너비 = 너비;
	}
	public long get높이() {
		return 높이;
	}
	public long set면적(long 면적) {
		return 면적 = 면적;
	}
	public long get면적() {
		return this.높이 * this.너비;
	}
}

public class Example05 {
	public static void main(String[] args) {
		// 너비, 높이
		Rect rect = new Rect(10,20);
		rect.set너비(30);
		System.out.println(rect.get너비());
		System.out.println(rect.get면적());
	}
}
