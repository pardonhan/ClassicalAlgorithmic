package com.alogrithmic.Rabbit;
/*������3��
���� ��ˮ����
��Ŀ����ӡ�����е�"ˮ�ɻ���(narcissus number)"����ν"ˮ�ɻ���"��ָһ����λ����
���λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ�� */

public class ThirdNarcissusNum {
	static int b,bb,bbb;
	public static void main(String[] args) {
		for(int num =100;num<1000;num++){
			f(num);
		}
	}
	public static void f(int m) {
		bbb = m / 100;
		bb = (m % 100) / 10;
		b = (m % 100) % 10;
		if ((bbb * bbb * bbb + bb * bb * bb + b * b * b) == m) {
			System.out.println(m);
		}
	}
}
