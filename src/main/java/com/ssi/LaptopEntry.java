package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop(111,"HCL",40000);
		Laptop l2=new Laptop(112,"HP",50000);
		Laptop l3=new Laptop(113,"Sony",60000);
		Laptop l4=new Laptop(114,"DELL",30000);
		Laptop l5=new Laptop(115,"Apple",45000);
		Laptop l6=new Laptop(116,"Lenevo",55000);
		
		
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3);
		session.save(l4); session.save(l5); session.save(l6);
		tr.commit();
		session.close();
		
		System.out.println("Laptop Details Stored");
	}

}
