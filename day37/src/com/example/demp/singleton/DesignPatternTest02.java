package com.example.demp.singleton;

//builder, Singleton, Facade, 전략(Strategy)m Command

//정적 메소드로만 구성된 클래스는 객체를 생성하지 않아도 된다
//그런데 객체를 생성하지 않으면 많은 제약이 따른다. : 객제 한개만 생성(Singletojg)

class sample{
	// 자기 자신의 static 필드를 거친다
	private sample() { 
	}
	
	private static sample obj = new sample() {
	
		public static sample getInsrance(){
			return obj;
}
	
public class DesignPatternTest02 {
	public static void main(String[] args) {
		sample obj = sample.getInsrance();
	}
}