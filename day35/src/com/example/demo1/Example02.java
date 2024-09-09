package com.example.demo1;

class TV {
	String company;
	long year;
	long inch;
	
	TV(String company, long year, long inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}

	void info() {
		System.out.println(year + "년 " + company + " " + inch + "인치");
		
	}
}



public class Example02 {
	public static void main(String[] args) {
		TV tv = new TV("LG",2020,75);
		// TV의 정보 출력
		// ㅣㅎ
		tv.info();
	}
}
