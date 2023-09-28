package com.jdc.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.jdc.app.model.dto.Student;

public class TestJPAFind {
	
//	@Test
	public void findJpa() {
		
		var emf = Persistence.createEntityManagerFactory("JPATest");
		var em = emf.createEntityManager();
		
		em.persist(new Student(1, "Thet", "Nurse", 21));
		
		// Find Data from Table
		var stu = em.find(Student.class, 1);
		System.out.println(stu.getId());
		
		stu.setMajor("English Advance");
		
		System.out.println(stu.getMajor());
		
		assertEquals("English Advance", stu.getMajor());
		assertEquals(1, stu.getId());
		
		emf.close();
		em.close();
	}

}
