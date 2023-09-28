package com.jdc.app.test;

import org.junit.jupiter.api.Test;

import com.jdc.model.dto.Student;

import jakarta.persistence.Persistence;

public class Testing {
	
	@Test
	public void TestOne() {
		
		var emf = Persistence.createEntityManagerFactory("JPAIntro");
		var em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		var std = new Student();
		std.setId(1);
		std.setName("Aung");
		std.setPhone(987654);
		std.setAddress("yangon");
		
		var stt = new Student(2, "Nilar","myeik",877643);
		
		em.persist(std);
		em.persist(stt);
		
		em.getTransaction().commit();
		emf.close();
		em.close();
		
	}

}
