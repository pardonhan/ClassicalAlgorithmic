package com.alogrithmic.Rabbit;
/**
 * 兔子的规律为数列1,1,2,3,5,8,13,21.... 
 * @author asus
 *
 */
public class RabbitQuestion {
	public static final int MONTH =15;
	public static void main(String[] args) {
		long f1=1L,f2=2L;
		long f;
		for(int i=3;i<MONTH;i++){
			f=f2;
			f2= f1+f2;
			f1=f;
			System.out.print("第" + i +"个月的兔子对数: ");
			System.out.println(" " + f2);
		}
	}
}
