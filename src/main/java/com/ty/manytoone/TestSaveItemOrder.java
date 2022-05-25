package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveItemOrder {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Item item1=new Item();
		item1.setName("working table");
		item1.setPrice(1200);
		item1.setQuantity(1);
		
		Item item2=new Item();
		item2.setName("Hp laptop");
		item2.setPrice(50000);
		item2.setQuantity(1);
		
		Item item3=new Item();
		item3.setName("working chair");
		item3.setPrice(1800);
		item3.setQuantity(2);
		
		AmazonOrder amazonOrder=new AmazonOrder();
		amazonOrder.setName("office items");
		amazonOrder.setAddress("basavanagudi");
		amazonOrder.setStatus("order shifted");
		
		item1.setAmazonOrder(amazonOrder);
		item2.setAmazonOrder(amazonOrder);
		item3.setAmazonOrder(amazonOrder);
		
		entityTransaction.begin();
	    entityManager.persist(amazonOrder);
	    entityManager.persist(item1);
	    entityManager.persist(item2);
	    entityManager.persist(item3);
		entityTransaction.commit();
		
		
		

	}

}
