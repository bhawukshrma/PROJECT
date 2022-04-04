package com.ecommerce.model;

public class CartLineInfo {

	int quantity;
	ProductInfo productInfo;
	
	public CartLineInfo() 
	{
	    this.quantity = 0;
	} 
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductInfo getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}
    
}
