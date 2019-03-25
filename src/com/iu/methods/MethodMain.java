package com.iu.methods;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest1 m1 = new MethodTest1();
		
		/*System.out.println("1. plus");
		System.out.println("2. minus");
		int select = sc.nextInt();
		if(select == 1) {
			m1.hap();
		}
		else
			m1.minus();*/
		System.out.print("size : ");
		int size = sc.nextInt();
		m1.bark(size);//인자값
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		m1.hap(num1, num2);
	}
}