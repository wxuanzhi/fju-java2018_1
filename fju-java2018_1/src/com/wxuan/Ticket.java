package com.wxuan;

public class Ticket {
	int price = 1000;
	boolean roundTrip;
	public Ticket(boolean roundTrip){
		this.roundTrip = roundTrip;
	}
	public int getPrice(){
		int total = price;
		if(roundTrip){
			total = (int)(price * 2 * 0.9f);
		}
		return total;
	}

}
