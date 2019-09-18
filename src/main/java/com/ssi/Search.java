package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Util.getSF().openSession();
		//SearhEmployee
		Employee emp=session.get(Employee.class, 112);
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getLaptop());
		List<Vehicle> vehicles=emp.getVehicle();
		for(Vehicle vehicle:vehicles){
			System.out.println(vehicle.getVid()+","+vehicle.getVtype());
		}
		List<Project> projects=emp.getProject();
		
		for(Project project:projects){
			System.out.println(project.getPid()+","+project.getTitle());
		}
		session.close();

	}

}
