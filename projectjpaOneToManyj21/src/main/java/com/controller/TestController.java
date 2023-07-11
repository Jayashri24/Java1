package com.controller;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.model.*;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("q");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Questions q=new Questions();
		q.setQuestionId(1);
		q.setQuestionName("what is Java");
		
		Answer ans1=new Answer(1001,"Java is opps");
		Answer ans2=new Answer(1002,"Java is platform");
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		
		q.setAnswer(list);
		
		em.persist(ans1);;
		em.persist(ans2);
		em.persist(q);
		
		em.getTransaction().commit();
		
		System.out.println("Saved");
		
		
		}

}
