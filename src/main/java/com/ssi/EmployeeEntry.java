package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(111,"AAA",100000,new Laptop(111));
		e1.getProject().add(new Project(111));
		e1.getProject().add(new Project(112));
		e1.getProject().add(new Project(113));
		
		Employee e2=new Employee(112,"BBB",150000,new Laptop(112));
		e2.getProject().add(new Project(113));
		e2.getProject().add(new Project(114));
		e2.getProject().add(new Project(115));
		
		
		Employee e3=new Employee(113,"CCC",200000,new Laptop(113));
		e3.getProject().add(new Project(111));
		e3.getProject().add(new Project(114));
		e3.getProject().add(new Project(115));
		
		Employee e4=new Employee(114,"DDD",250000,new Laptop(114));
		e4.getProject().add(new Project(114));
		e4.getProject().add(new Project(115));
		
		
		Employee e5=new Employee(115,"EEE",300000,new Laptop(115));
		e5.getProject().add(new Project(111));
		e5.getProject().add(new Project(112));
		e5.getProject().add(new Project(113));
		e5.getProject().add(new Project(114));
		
		Employee e6=new Employee(116,"FFF",350000,new Laptop(116));
		e6.getProject().add(new Project(115));
		
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); session.save(e4);
		session.save(e5); session.save(e6);
		tr.commit();
		session.close();
		
		System.out.println("EMPLOYEES DATA STORED");
	}

}
