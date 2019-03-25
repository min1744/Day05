package com.iu.methods;

public class MethodMain3 {

	public static void main(String[] args) {
		MethodTest3 t3 = new MethodTest3();
		int num = 3;
		t3.test(num);
		System.out.println(num);
		
		Product product = new Product();
		product.price = 700;
		t3.test2(product);
		System.out.println(product.price);
		
		t3.test3(product);
		System.out.println(product.price);
		
		
	}
}