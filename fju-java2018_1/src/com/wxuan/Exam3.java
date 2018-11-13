package com.wxuan;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecretNumber secret = new SecretNumber();
		Scanner scanner = new Scanner(System.in);
		int diff = -1;
		while(diff != 0){
			System.out.print("Your guess:");
			int number = scanner.nextInt();
			diff = secret.guess(number);
			if(diff > 0){
				System.out.println("higher");
			}else if(diff == 0){
				System.out.println("Great!The secret number is:" + secret);
			}else{
				System.out.println("lower");
			}
		}

	}

}
