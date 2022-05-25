package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospital {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Branch branch1=new Branch();
		branch1.setName("cardiology");
		branch1.setState("karnataka");
		branch1.setCountry("india");
		branch1.setPhone(9988777666l);
		
		Branch branch2=new Branch();
		branch2.setName("dermatology");
		branch2.setState("odisha");
		branch2.setCountry("india");
		branch2.setPhone(998777666l);
		
		Branch branch3=new Branch();
		branch3.setName("cycology");
		branch3.setState("keralla");
		branch3.setCountry("india");
		branch3.setPhone(998899666l);
		
		Hospital hospital=new Hospital();
		hospital.setName("Ramaya Hospital");
		hospital.setWeb("ramaya.hos.karnataka.www.com");
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
	    entityManager.persist(hospital);
	    entityManager.persist(branch1);
	    entityManager.persist(branch2);
	    entityManager.persist(branch3);
		entityTransaction.commit();
		
		

	}

}
