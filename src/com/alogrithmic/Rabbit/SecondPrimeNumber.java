package com.alogrithmic.Rabbit;

public class SecondPrimeNumber {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		for(int i = 101;i<=200;i++){
			
			boolean b = true;
			
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					b = false;
					break;
				}
			}
			
			if(b){
				count++;
				System.out.println(i+"");
			}
		}
		System.out.println("素数的个数："+count);
	}

}
