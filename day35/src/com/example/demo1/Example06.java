package com.example.demo1;

class TV06{
	private long channel = 1;
	private long volume = 5;
	
	public void setChannel(long channel) {
		this.channel = channel;
	}
	
	public void incChannel() {
		this.channel++;
		if(this.channel>999)
			this.channel =1;
	}
	public void decChannel() {
		this.channel--;
		if(this.channel<0)
			this.channel=999;
	}
}

public class Example06 {
	public static void main(String[] args) {
		TV06 tv = new TV06();
	}
}
