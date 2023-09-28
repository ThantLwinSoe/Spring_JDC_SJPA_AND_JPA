package com.jdc.app.test;

import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.jdc.app.model.dto.Student;

public class TestJpa {
	
	@Test
	public void testOne() {
		var emf = Persistence.createEntityManagerFactory("JPATest");
		var em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		var st_1 = new Student(1, "Thet", "Nurse", 21);
		var st_2 = new Student(2, "Thant", "IT", 15);
		var st_3 = new Student(3, "Aung", "Engineering", 4);
		
		em.persist(st_1);
		em.persist(st_2);
		em.persist(st_3);
		
		em.getTransaction().commit();
	
		emf.close();
		em.close();
		
		
	}

}
