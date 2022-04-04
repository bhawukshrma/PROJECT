package com.ecommerce.model;

public class OrderDetailInfo {

	 String id;
	 String productCode;
	 String productName;
	 double quanity;
	 double price;
	 double amount;
	 
	 public OrderDetailInfo() 
	 {
	 }

	public double getQuanity() {
		return quanity;
	}

	public void setQuanity(double quanity) {
		this.quanity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public OrderDetailInfo(String id, String productCode, String productName, double quanity, double price,
			double amount) {
		super();
		this.id = id;
		this.productCode = productCode;
		this.productName = productName;
		this.quanity = quanity;
		this.price = price;
		this.amount = amount;
	}

}
