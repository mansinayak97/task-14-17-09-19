package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String brand;
	private int price;
	@OneToOne(mappedBy="laptop")
	private Employee emp;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Laptop(int lid, String brand, int price) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.price = price;
		
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lid) {
		super();
		this.lid = lid;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price
				+ "]";
	}
	
}
