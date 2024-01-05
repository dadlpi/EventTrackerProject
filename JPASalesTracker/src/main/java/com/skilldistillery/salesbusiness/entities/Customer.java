package com.skilldistillery.salesbusiness.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "active_ind")
	private boolean activeInd;
	
	@CreationTimestamp
	@Column(name = "create_date")
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	@Column(name = "modify_date")
	private LocalDateTime modifyDate;
	
	
	public Customer() {
		super();
	}


	public Customer(int id, String firstName, String lastName, boolean activeInd, LocalDateTime createDate,
			LocalDateTime modifyDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.activeInd = activeInd;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public boolean isActiveInd() {
		return activeInd;
	}


	public void setActiveInd(boolean activeInd) {
		this.activeInd = activeInd;
	}


	public LocalDateTime getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}


	public LocalDateTime getModifyDate() {
		return modifyDate;
	}


	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}


	@Override
	public int hashCode() {
		return Objects.hash(activeInd, createDate, firstName, id, lastName, modifyDate);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return activeInd == other.activeInd && Objects.equals(createDate, other.createDate)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(modifyDate, other.modifyDate);
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", activeInd=" + activeInd
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate + "]";
	}
	
	
	
	
	
	
	
	
}
