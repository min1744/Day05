package com.iu.mart;

public class ProductView {
	public void info(Product product) {
		System.out.println("Price : " + product.price);
		System.out.println("Amount : " + product.amount);
		System.out.println("Brand : " + product.brand);
		System.out.println("Sale : " + product.sale);
	}
}