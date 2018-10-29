package com.wxuan;

import java.util.Scanner;

public class SignUp {
	
	public static void main(String[] args){
        System.out.println("Are you 18 ? (y/N)");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        System.out.println("*"+line+"*");
        boolean adult = line.toUpperCase().equals("Y");
        Member member = new Member(adult);
        if (member.adult) {
        	member.startInput();
        	
        } else {
        	System.out.println("Thank you,bye");
        }
	}
}