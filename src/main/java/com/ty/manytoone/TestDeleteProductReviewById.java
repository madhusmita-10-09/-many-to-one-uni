package com.ty.manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteProductReviewById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product = new Product();
		Review review = entityManager.find(Review.class, 1);

		
		entityTransaction.begin();
		entityManager.remove(review);
		entityManager.remove(product);
		entityTransaction.commit();

	}

}
