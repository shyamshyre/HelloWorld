package com.shyam.manytoone;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.shyam.manytoone.student.Student;
import com.shyam.manytoone.util.HibernateUtil;

public class Main {

	public static void main(String s[])throws Exception
	{
	
		try{
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session= factory.openSession();
			Transaction  transaction = session.beginTransaction();
			
			Address address1 = new Address("ABCDStreet","ABCCITY","ABSSTATE","12345");
			Student student = new Student("Shyam",address1);
			Student student1 = new Student("Ramu",address1);
			Student student2 = new Student("Chinna",address1);
			
			session.save(address1);
			System.out.println("hai");
			session.save(student);
			session.save(student1);
			//session.save(address1);
			//session.save(student);
			//session.save(student1);
			//session.save(student2);
			
			transaction.commit();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
