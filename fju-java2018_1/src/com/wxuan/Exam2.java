package com.wxuan;

import java.util.Scanner;
import java.util.Random;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		int guess = 0;
		while(guess!=secret){
			System.out.println("Your Guess("+count+"/4):");
			guess = scanner.nextInt();
			if(guess<secret){
				System.out.println("higher");
			}else{
				System.out.println("lower");
			}
			count++;
			
		}
		if(count>2){
			System.out.println("Great!The secret number is " + secret);
		}else{
			System.out.println("Excellent!The secret number is "+ secret);
		}

	}

}
