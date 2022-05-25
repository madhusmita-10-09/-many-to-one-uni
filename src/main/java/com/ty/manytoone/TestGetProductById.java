package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetProductById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Review review=entityManager.find(Review.class, 4);
		if(review!=null)
		{
			System.out.println(review.getProduct());
			System.out.println(review.getDescription());
			
		}
		else
		{
			System.out.println("no Review ");
		}

	}

}
