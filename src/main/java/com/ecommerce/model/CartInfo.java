package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class CartInfo {

	int orderNum;
    CustomerInfo customerInfo;
    final List<CartLineInfo> cartLines = new ArrayList<CartLineInfo>();
    public CartInfo() 
    {    	
    }
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public List<CartLineInfo> getCartLines() {
		return cartLines;
	}
    
}
