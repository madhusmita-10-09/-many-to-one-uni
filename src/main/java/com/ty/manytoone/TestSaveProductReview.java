package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProductReview {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Review review1=new Review();
		review1.setDescription("its good but not that much comfortable");
		
		Review review2=new Review();
		review2.setDescription("its not good");
		
		Review review3=new Review();
		review3.setDescription("money waste");
		
		Product product=new Product();
		product.setName("kurti");
		product.setBrand("avasa");
		product.setCost(1200);
		
	
		
		review1.setProduct(product);
		review2.setProduct(product);
		review3.setProduct(product);
		
		entityTransaction.begin();
	    entityManager.persist(product);
	    entityManager.persist(review1);
	    entityManager.persist(review2);
	    entityManager.persist(review3);
		entityTransaction.commit();
		
		
		
	}

}
