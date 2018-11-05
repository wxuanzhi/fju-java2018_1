package com.wxuan;

import java.util.Scanner;
import java.util.Random;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int small = 1, large = 100;
		Scanner scanner = new Scanner(System.in);
		float number =(float)Math.random();
		number = number*100f;
		int num = (int)number + 1;
		System.out.println("Guess a number betweem 1 to 100");
		
		while(true)
		{
			int guess = scanner.nextInt();
			if(guess > num)
			{
				System.out.println("Guess a number" + small + "~" + guess);
				large = guess; 
			}
			else if(guess < num)
			{
				System.out.println("Guess a number" + guess + "~" + large);
				small = guess;
			}
			else
			{
				System.out.println("°Ú¤£´N¦n´Î´Î");
				break;
			}
		}

	}

}