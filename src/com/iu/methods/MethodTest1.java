package com.iu.methods;

//import java.util.Scanner;

public class MethodTest1 {
	//멤버메서드를 선언
	public void hap(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	//메서드 명 : minus
	//10-20의 결과물 출력
	public void minus() {
		System.out.println(10-20);
	}
	
	//메서드명 bark
	//메서드 내에 size 변수를 선언 값을 입력 받는다.
	//size가 90보다 크면 컹컹컹
	//size가 60보다 크면 멍멍멍
	//그 외는 왈왈왈
	String a[] = {"컹컹컹", "멍멍멍", "왈왈왈"};
	public void bark(int size) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("size 입력 : ");*/
		if(size >= 90) {
			System.out.println("컹컹컹");
		}else if(size >= 60) {
			System.out.println("멍멍멍");
		}else
			System.out.println("왈왈왈");
	}
}