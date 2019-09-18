package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	private int vid;
	private String vtype;
	@ManyToOne
	private Employee emp;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Vehicle(int vid, String vtype, Employee emp) {
		super();
		this.vid = vid;
		this.vtype = vtype;
		this.emp = emp;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vid) {
		super();
		this.vid = vid;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vtype=" + vtype 
				+ "]";
	}
	
}
