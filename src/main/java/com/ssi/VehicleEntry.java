package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicleEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Util().getSF().openSession();

		Vehicle v1= new Vehicle(101, "Audi",new Employee(111));
		Vehicle v2= new Vehicle(102, "Jaguar",new Employee(111));
		Vehicle v3= new Vehicle(103, "RangeRover",new Employee(112));
		Vehicle v4= new Vehicle(104, "Audi",new Employee(113));
		Vehicle v5= new Vehicle(105, "Jaguar",new Employee(114));
		Vehicle v6= new Vehicle(106, "RangeRover",new Employee(114));
		Vehicle v7= new Vehicle(107, "Audi",new Employee(115));
		Vehicle v8= new Vehicle(108, "Jaguar",new Employee(115));
		Vehicle v9= new Vehicle(109, "RangeRover",new Employee(116));
		
		Transaction tr = session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		session.save(v4); session.save(v5); session.save(v6);
		session.save(v7); session.save(v8); session.save(v9);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}

}
