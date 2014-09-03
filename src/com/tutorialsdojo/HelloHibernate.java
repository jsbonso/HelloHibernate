package com.tutorialsdojo;

//import Hibernate Util
import com.tutorialsdojo.util.HibernateUtil;
import com.tutorialsdojo.persistence.Hello;


//import Hibernate
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HelloHibernate {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Processing...");
		
		HelloHibernate obj = new HelloHibernate();
		Long id = obj.addRow("Hello Sensei!");
		
		System.out.println("Success! Created HELLO table.");

	}
	
	public Long addRow(String name){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		Long id = null;
		
		try {
			transaction = session.beginTransaction();
			
			Hello hello = new Hello();
			hello.setName(name);
			id = (Long) session.save(hello);
			transaction.commit();
		
		} catch (HibernateException e){
			transaction.rollback();
			e.printStackTrace();
		
		} finally {
			session.close();
		}
	
		return id;
	}
	

}
