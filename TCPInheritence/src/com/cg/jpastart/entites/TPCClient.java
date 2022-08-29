package com.cg.jpastart.entites;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TPCClient {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create objects
		Employee employee = new Employee();
		employee.setName("John");
		employee.setSalary(5000);
		em.persist(employee);//----> emp_store
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);//------>MGR
		
		em.getTransaction().commit();
		
		System.out.println("SUCCESSFUL");
		em.close();
		factory.close();
	}
}


