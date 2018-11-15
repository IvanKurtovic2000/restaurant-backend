package com.pwc.restaurant.Restaurant.entities;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@MappedSuperclass
public class BaseEntity {

	// This variable stores a unique identifier for the project
	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	public Long id;
		
	// This variable stores the Date of creation as a timestamp
		@Column(insertable = true, updatable = false)
		@CreationTimestamp
		private java.sql.Timestamp creationTimestamp;

		// This variable stores the Date of update as a timestamp
		@Column(insertable = false, updatable = true)
		@UpdateTimestamp
		private java.sql.Timestamp updateTimestamp;

	
	

	public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

	public java.sql.Timestamp getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(java.sql.Timestamp creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public java.sql.Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(java.sql.Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	
}

