package com.example.demo1;

public class Example07 {
	public static void main(String[] args) {
		Television tv = new Television("LG","OLED",1,5);
		System.out.println(tv.getChannel());
		tv.setChannel(11);
	}
}
