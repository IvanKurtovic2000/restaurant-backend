package com.pwc.restaurant.Restaurant.entities;



import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="TBL_INVOICE") 
public class Invoice extends BaseEntity {
	
	private String tableNumber;
	

	
	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}
	
}
