package com.iu.mart;

public class MartMain {

	public static void main(String[] args) {
		Product product = new Product();
		product.price = 10000;
		product.amount = 30;
		product.brand = "nike";
		
		Product product2 = new Product();
		product2.price = 20000;
		product2.amount = 20;
		product2.brand = "adidas";
		
		ProductView pv = new ProductView();
		pv.info(product);
	}
}