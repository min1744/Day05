package com.iu.methods;

public class MethodMain4 {

	public static void main(String[] args) {
		MethodTest4 m4 = new MethodTest4();
		int num = m4.plus(10, 20);
		
		int nums[] = m4.getNumbers();
		nums[0] = 10;
		System.out.println(nums[1]);
	}
}