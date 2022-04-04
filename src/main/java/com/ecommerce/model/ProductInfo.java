package com.ecommerce.model;

public class ProductInfo {
	
	String code;
    String name;
    double price;

    public ProductInfo() {
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductInfo(String code, String name, double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductInfo [code=" + code + ", name=" + name + ", price=" + price + ", getCode()=" + getCode()
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

}
