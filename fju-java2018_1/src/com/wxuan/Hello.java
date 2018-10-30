package com.wxuan; 

import java.util.Random;
import java.util.Scanner;

public class Hello {
 
	public static void main(String[] args) {
		int a = 5;
		while(a > 0){
		System.out.println("AAAA");
		a = a-6;
		}
		
		// TODO Auto-generated method stub
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name?");
		String name = scanner.nextLine();
		System.out.println(name);
		

		Student stu = new Student("wxuan", 70, 90);
		stu.print();
		System.out.println(3 <= 5);
		String s = new String("abc");
		System.out.println(s);
		System.out.println(s == s);
		

		/*stu.name = "wxuan"
		stu.english = 70;
		stu.math = 90;*/
		
		Person p = new Person(47f, 1.53f);
		System.out.println(p.bmi());
		p.hello();
		
		p.weight = 47f;
		p.height = 1.53f;
		
		Person wxuan = new Person(0, 0);
		Person jack = null;
		jack.hello();
		/*System.out.println("Hello world");
		int age = 18;
		float weight = 47f;
		float height = 1.53f;
		String name = "wxuan";
		int schoolYear = 107;
		System.out.println(age);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(name);
		float bmi = weight / (height * height); 
		System.out.println(bmi);
		age = age + 1;
		System.out.println(age);
		float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println(f);*/
	}


		
		
		
		
		
		
	}
