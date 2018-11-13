package com.wxuan;

import java.util.Random;

public class SecretNumber {
	int secret;
	public SecretNumber(){
		Random random = new Random();
		secret = random.nextInt(10) + 1;
		System.out.println(secret);
	}
	public int guess(int number){
		return secret - number;
	}

}
