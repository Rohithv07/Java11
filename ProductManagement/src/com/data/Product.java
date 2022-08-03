package com.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;

/**
 * {@code Product} class represents properties and behaviours of product objects
 * in the Product Management System <br>
 * Each product has an id, name, price <br>
 * Each product can have a discount, calculated based on {@link DISCOUNT_RATE
 * discount rate}
 * 
 * @version 1.0
 * @author rohithvazhathody
 *
 */
public class Product {

	private int id;
	private String name;
	private BigDecimal price;

	/**
	 * A constant that defines {@link java.math.BigDecimal} value of the discount
	 * rate <br>
	 * Discount rate is 10%;
	 */
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	/**
	 * Calculate discount based on product price and {@link DISCOUNT_RATE discount
	 * rate}
	 * 
	 * @return {@link java.math.BigDecimal}
	 */
	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}

}
