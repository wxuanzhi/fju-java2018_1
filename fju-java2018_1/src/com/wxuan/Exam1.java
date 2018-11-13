package com.wxuan;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numOfTicket = 0;
		while (numOfTicket != -1)
			System.out.print("Please enter number of tickets:");
		numOfTicket = scanner.nextInt();
		if(numOfTicket == -1)
			break;
		System.out.print("How many round-trip tickets:");
		int rtrip = scanner.nextInt();
		System.out.println("Total tickets:" + numOfTicket);
		System.out.println("Round-trip:" + rtrip);
		//int total = (numOfTicket-rtrip)*ticket.getPrice
		//roundTicket.getPrice()*rtrip;
		TicketCounter ticketCounter = new TicketCounter();
		System.out.println("Total:" + ticketCounter.total());
		
		
		

	}

}
