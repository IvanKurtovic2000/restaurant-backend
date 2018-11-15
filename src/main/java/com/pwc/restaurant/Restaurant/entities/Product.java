package com.pwc.restaurant.Restaurant.entities;


import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="TBL_PRODUCT") 
public class Product extends BaseEntity  {
	
	private long productId;
	private String name;
	private String description;
	private float netPrice;
	
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(float netPrice) {
		this.netPrice = netPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", id=" + id + "]";
	}
	

}

