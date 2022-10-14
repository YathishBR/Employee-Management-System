package com.estuate.project.assesment;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application2 {

	public static void main(String[] args) {
		System.out.println("Hi...welcome to Employee Management Application");
		
		
		
		
//		 System.out.println("==================MENU=================");
//         System.out.println("1. Create a new user");
//         System.out.println("2. See a user");    
//         System.out.println("3. Update a user information");
//         System.out.println("4. Delete a user");

		
		System.out.println("Select 1 to perform CRUD operations on Employee table");
		System.out.println("Select 2 to perform CRUD operations on Department table");
//		
		System.out.println("Please Enter your choice...");
		Scanner sc = new Scanner(System.in);
//		int input=sc.nextInt();
//		if(input==1)
//		{
//			 System.out.println("=========Employee Table MENU=================");
//	         System.out.println("1. Create a new user");
//	         System.out.println("2. See a user");    
//	         System.out.println("3. Update a user information");
//	         System.out.println("4. Delete a user");
//	         int choice= sc.nextInt();
//	         Configuration cfg = new Configuration();
//	 		cfg.configure("hibernate.cfg.xml");
//	 	   SessionFactory factory =cfg.buildSessionFactory(); 
//	 	   
//	 		
//	 		
//	 		
//	 	   
//	 		switch (choice) {
//	 		case 1:
//	 			
//	 			System.out.println("please Enter Employee id: ");
//	 			int  empid =sc.nextInt();
//	 			System.out.println("please Enter Employee Name ");
//	 			String ename=sc.next();
//	 			System.out.println("please Enter Employee Department Number: ");
//	 			int  deptno =sc.nextInt();
//	 			System.out.println("please Enter Employee Designation ");
//	 			String designation=sc.next();
//	 			System.out.println("please Enter Employee Date of Birth ");
//	 			String dateOfBirth=sc.next();
//	 			System.out.println("please Enter Employee salary: ");
//	 	         double  salary =sc.nextDouble();
//	 			
//	 			
//	 			
//	 		   
//	 		   Employee e = new Employee();
//	 		   e.setEmpid(empid);
//	 		   e.setName(ename);
//	 		   e.setDeptno(deptno);
//	 		   e.setDesignation(designation);
//	 		   e.setDateOfBirth(dateOfBirth);
//	 		   e.setSalary(salary);
//	 		   
//
//	 		   
//	 		   
//	 		   
//	 		   Session session1 =factory.openSession();
//	          session1.save(e);
//	 		     
//	 		     Transaction tx1 = session1.beginTransaction();
//	 		     tx1.commit();
//	 		     session1.close();
//	 		     System.out.println("Employee table created......");
//	 		     break;
//	 		     
//	 		     case 2:
//	 		    	 Session session4 =factory.openSession();
//	 		            
//	 			     List <Employee> list =session4.createQuery("from Employee").getResultList();		   
//	 	  for(Employee e3:list)
//	 		     
//	 		    	 System.out.println("Employee_id: "+ empid+"\n\n"+"Employee_name:  "+ename+"\n\n"+"Department_Number: "+deptno+"\n\n"+"Designation: "+designation+
//	 		    			 "\n\n"+"Date of Birth: "+dateOfBirth+"\n\n"+"Salary "+salary);
//	 		 	
//		   Session session4 =factory.openSession();
//          
//	     List <Employee> list =session4.createQuery("from Employee").getResultList();	
//	     System.out.println(list);
//for(Employee e3:list)
//   {
//  	 System.out.println("Employee_id: "+e3.getEmpid()+"\n\n"+"Employee_name:  "+e3.getName()+"\n\n"+"Department_Number: "+e3.getDeptno()+"\n\n"+"Designation "+e3.getDesignation()+
//  			 "\n\n"+"Date of Birth: "+e3.getdateOfBirth()+"\n\n"+"Salary "+e3.getSalary());
//	}
//
//	 		   
//	       System.out.println("Selected all details Successfully");
//	 				    session4. getTransaction().commit();
//	 				   break;
//	 				    
//	 		     case 3:
//	 				    
//	 		   System.out.println("Enter the Employee name: ");
//	 		   String uname= sc.next();
//	 		     Session session2 =factory.openSession();
//	 		      session2.beginTransaction();
//	 		     
//	 		     Employee e1= (Employee) session2.get(Employee.class, 2);
//	 		       e1.setName(uname);
//	 		       
//	 		        System.out.println("Employee Updated successfully!!!");
//	 		       
//	 		        session2.getTransaction().commit();
//	 		        
//	 		       break;
//	 		     case 4:
//	 			   Session session3 =factory.openSession();
//	 	             session3.beginTransaction();
//	 	      Employee e2 = (Employee) session3.load(Employee.class, 2);
//	 	      session3.delete(e2);
//	 	      System.out.println("Deleted Successfully");
//	 			    session3. getTransaction().commit();
//	 			     factory.close();
//	 			    break;
//	 			 
//	 			     default:
//	 			    	 System.out.println("Please select the correct choice");
//	 			    	 System.exit(0);
//	 			     	}
//		}
//			else if(input==2)
//			{
//				 System.out.println("=========Department Table MENU=================");
//		         System.out.println("1. Create a new user");
//		         System.out.println("2. See a user");    
//		         System.out.println("3. Update a user information");
//		         System.out.println("4. Delete a user");
//			}
//			else {
//				System.out.println("Invalid .....Please select valid choice");
//			}
			
		
		int choice= sc.nextInt();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	   SessionFactory factory =cfg.buildSessionFactory(); 
	   
		
		
		
	   
		switch (choice) {
		case 1:
			
			System.out.println("please Enter Employee id: ");
			int  empid =sc.nextInt();
			System.out.println("please Enter Employee Name ");
			String ename=sc.next();
			System.out.println("please Enter Employee Department Number: ");
			int  deptno =sc.nextInt();
			System.out.println("please Enter Employee Designation ");
			String designation=sc.next();
			System.out.println("please Enter Employee Date of Birth ");
			String dateOfBirth=sc.next();
			System.out.println("please Enter Employee salary: ");
	         double  salary =sc.nextDouble();
			
			
			
		   
		   Employee e = new Employee();
		   e.setEmpid(empid);
		   e.setName(ename);
		   e.setDeptno(deptno);
		   e.setDesignation(designation);
		   e.setDateOfBirth(dateOfBirth);
		   e.setSalary(salary);

		   
		   
		   
		   Session session1 =factory.openSession();
         session1.save(e);
		     
		     Transaction tx1 = session1.beginTransaction();
		     tx1.commit();
		     session1.close();
		     System.out.println("Employee table created......");
		     System.out.println();
		     System.out.println();
		   
		   System.out.println("Enter the Employee name to  perform update operation: ");
		   String uname= sc.next();

		     Session session2 =factory.openSession();
		      session2.beginTransaction();
		 
		     Employee e1= (Employee) session2.get(Employee.class, 2);
		       e1.setName(uname);
		       session2.saveOrUpdate(e1);
		       session2.save(e1);
		       session2.getTransaction().commit();
		       
		        System.out.println("Employee Updated successfully!!!");
		   
		        
		        System.out.println("Select operation starts....");
		        Session session4 =factory.openSession();
	            
			     @SuppressWarnings("unchecked") List <Employee> list =session4.createQuery("from Employee").getResultList();		   
	  for(Employee e3:list)
		     {
		    	 System.out.println("Employee_id: "+e1.getEmpid()+"\n\n"+"Employee_name:  "+e1.getName()+"\n\n"+"Department_Number: "+e1.getDeptno()+"\n\n"+"Designation: "+e1.getDesignation()+
		    			 "\n\n"+"Date of Birth: "+e1.getdateOfBirth()+"\n\n"+"Salary "+e1.getSalary());
		 	}
		     

	 
     System.out.println("Selected all details Successfully");
     
		        
     Session session3 =factory.openSession();
     session3.beginTransaction();
		        System.out.println("Enter the Employee  name to  perform delete operation: ");
				   String dname= sc.next();
	   
	      Employee e2 = (Employee) session3.get(Employee.class,2);
	      session3.delete(e2);
	      session3. getTransaction().commit();
	      System.out.println("Deleted Successfully");
			    
			     
			     
			     

				
				    factory.close();
				    
		       
			     
		       
		  
		  
		  
		     
			
			
			
		
			
			break;
			
			
			
			
			
			
			
			
//		case 2:
//			System.out.println("Select 2 to perform CRUD operations on  Department table");
//			System.out.println("please Enter Department id: ");
//			int deprtno =sc.nextInt();
//			System.out.println("please Enter Department Name ");
//			String dname=sc.next();
//			System.out.println("please Enter Purpose");
//			String purpose=sc.next();
//			
//			Department d = new Department();
//			Session session2 =factory.openSession();
//		     session2.save(d);
//		     
//		     Transaction tx2 = session2.beginTransaction();
//		     tx2.commit();
//		     session2.close();
//		     System.out.println("Department table created......");
//			
		   
			
			
//			break;
//
//		default:System.out.println("Invalid Choice.....");
//		        System.exit(0);
//			break;
		}

	}
	}


