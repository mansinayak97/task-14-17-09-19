package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			Project p1=new Project(111,"AcSw");
			Project p2=new Project(112,"ERP");
			Project p3=new Project(113,"BnkSw");
			Project p4=new Project(114,"SecApp");
			Project p5=new Project(115,"ECommerce");
			
			Session session=Util.getSF().openSession();
			Transaction tr=session.beginTransaction();
			session.save(p1); session.save(p2);
			session.save(p3); session.save(p4);
			session.save(p5); 
			tr.commit();
			session.close();
			System.out.println("PROJECT STORED");

		
	}

}
