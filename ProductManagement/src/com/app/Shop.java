package com.app;

import java.math.BigDecimal;

import com.data.Product;

/**
 * {@code Shop} class represents an application that manages Products
 * 
 * @version 1.0
 * @author rohithvazhathody
 *
 */
public class Shop {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(101);
		product.setName("Product");
		product.setPrice(BigDecimal.valueOf(1.99));

		System.out.println(
				product.getId() + " " + product.getName() + " " + product.getPrice() + " " + product.getDiscount());
	}

}
