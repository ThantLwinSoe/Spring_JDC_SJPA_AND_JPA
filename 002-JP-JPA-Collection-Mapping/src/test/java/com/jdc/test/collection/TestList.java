package com.jdc.test.collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.jdc.app.dto.Address;
import com.jdc.app.dto.Employee;

public class TestList {
	
	@Test
	public void TestOne() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACollection");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		var address_One = new Address("lanmadaw", "yangon", 11102);
//		var address_two = new Address("dawei", "Tanintaryi", 13340);
		
		var one = new Employee();
		one.setId(1);
		one.setName("Aung Myin");
		one.setPhone(988765);
		one.getAddress().add(address_One);
		
		/*
		var em_two = new Employee(2, "Nilar", 98764);
		em_two.getAddress().add(address_two); */
			
		em.persist(one);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
