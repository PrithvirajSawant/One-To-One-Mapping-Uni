package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Company;
import com.jsp.entities.GST;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		c.setName("Amazon");
		c.setAddress("Bangalore");
		c.setNoOfEmp(1000000);
		
		GST g = new GST();
		g.setNumber("gst2364");
		g.setCost(100000);
		c.setGst(g);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(c);
		em.persist(g);
		et.commit();

	}

}
