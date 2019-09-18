package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int eno;
	private String ename;
	private int sal;
	@OneToOne
	private Laptop laptop;
	@OneToMany(mappedBy="emp")
	private List<Vehicle> vehicle=new ArrayList<Vehicle>();
	@ManyToMany
	private List<Project> project=new ArrayList<Project>();
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public List<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Employee(int eno, String ename, int sal, Laptop laptop,
			List<Vehicle> vehicle, List<Project> project) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		this.vehicle = vehicle;
		this.project = project;
	}
	public Employee(int eno, String ename, int sal, Laptop laptop
			) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eno) {
		super();
		this.eno = eno;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal
				+ ", laptop=" + laptop + ", vehicle=" + vehicle + ", project="
				+ project + "]";
	}
	
}
