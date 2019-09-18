package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String title;
	@ManyToMany(mappedBy="project")
	private List<Employee> emp=new ArrayList<Employee>();
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	public Project(int pid, String title) {
		super();
		this.pid = pid;
		this.title = title;
		
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid) {
		super();
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", title=" + title 
				+ "]";
	}
	
}
