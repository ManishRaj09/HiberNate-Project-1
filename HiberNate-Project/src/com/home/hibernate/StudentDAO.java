package com.home.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.home.hibernate.StudentDTO;

public class StudentDAO {
	 
	public static void main(String[] args) {

	//	StudentDAO.fetchData();
	
		//StudentDAO.CreateData();
	
        	//StudentDAO.udateData();
		     
		        StudentDAO.dleateRecod();
		
	}

	public static void CreateData()
	{
	Configuration cfg=new  Configuration();
	cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessfact= cfg.buildSessionFactory();
		
	
	   Session sess=sessfact.openSession();
		
		sess.beginTransaction();
		
		StudentDTO std=new StudentDTO();
				
		
	    std.setsId(101);
		std.setName("Raja Babu");
		std.setAge(7);
		std.setMobileNo(868976565);
		std.setYPO(2020);
		std.setStrem("M E");
		std.setPer(73.80);
		
		sess.save(std);
		
		Transaction tx=sess.beginTransaction();
		tx.commit();
		
		sess.close();
		sessfact.close();
		
	
}

	public static void fetchData()
		{
		Configuration cfg=new  Configuration();
		cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sessfact= cfg.buildSessionFactory();
			
		
		   Session sess=sessfact.openSession();
			
			sess.beginTransaction();
			
			StudentDTO std=new StudentDTO();
			StudentDTO stuDto= (StudentDTO) sess.load(StudentDTO.class, 3);
			
			if (stuDto != null)
			{
				System.out.println(stuDto);
				
			}
			else
				System.out.println("Student DTO Is null");
			
			
			sess.close();
			sessfact.close();
			
		
	}

	public static void udateData()
	{
	Configuration cfg=new  Configuration();
	cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessfact= cfg.buildSessionFactory();
		
	
	   Session sess=sessfact.openSession();
		
		sess.beginTransaction();
		
		StudentDTO std=new StudentDTO();
		
		
		std.setsId(101);
		std.setName("Viraj kumar");
		std.setAge(20);
		std.setMobileNo(964367898);
		std.setYPO(2019);
		std.setStrem("Develoer");
		std.setPer(89.87);
		
		Transaction tx=sess.beginTransaction();
        
		sess.update(std);
		
        tx.commit();
		
		System.out.println("Student info Updated");
				
		sess.close();
		sessfact.close();
		
	
}
	
	public static void dleateRecod()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessfact=cfg.buildSessionFactory();
		
		Session sess=sessfact.openSession();
		sess.beginTransaction();
		
		StudentDTO stdUp=new StudentDTO();
	
		stdUp.setsId(101);
		
		Transaction tx=sess.beginTransaction();
		sess.delete(stdUp);
		tx.commit();
		
		
		System.out.println("1 row id deleted from table ");
		
		sess.close();
		sessfact.close();
	}


}
