package com.alogrithmic.Rabbit;
/**
 * ��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
 * @author asus
 *
 */
public class FourthPrimerFactory {
	static int n,k=2;
	public static void main(String[] args) {
		n=90;
		System.out.print(n+"=");
		f(n);
	}
	public static void f(int i){
		while(k<=i){
			if(k==i){
				System.out.println(i);
				break;
			}else if(i>k&&i%k==0){
				System.out.print(k+"*");
				i=i/k;
				f(i);
				break;
			}else if(i>k&&i%k!=0){
				k++;
				f(i);
				break;
			}
		}
	}
}
