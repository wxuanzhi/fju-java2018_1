package com.wxuan;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		System.out.println("Please enter temperature(Celsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temperature temp = new Temperature(c);
		
//		double f = c*(9.0/5) + 32;
		System.out.printf("%.1f C = %.1f F\nkelvin:%.1 K",
				c, temp.fahrenheit(), temp.kelvin());
		
		

	}

}
