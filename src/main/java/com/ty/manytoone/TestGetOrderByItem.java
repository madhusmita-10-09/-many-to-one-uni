package com.ty.manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class TestGetOrderByItem {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Item item=entityManager.find(Item.class, 1);
		if(item!=null)
		{
			System.out.println(item.getAmazonOrder());
			System.out.println(item.getName());
			System.out.println(item.getPrice());
		}
		else
		{
			System.out.println("no item");
		}

	}

}
