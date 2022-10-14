package com.estuate.project.assesment;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hi...welcome to Employee Management Application");
		Scanner sc = new Scanner(System.in);
		
		
		//Connecting Java Program To DataBase By Using Hibernate
		


		
		

		
		
		while(true) {
			System.out.println("Select Database");
			System.out.println("1: Employee DataBase\n2: Department Database");
			System.out.println("***********************************");
			int input=sc.nextInt();
			
			if(input==1)
			{
				System.out.println("=========Employee Table MENU=================");
				System.out.println("1. Create a new user");
				System.out.println("2. Update a user information\")");    
				System.out.println("3. See a user Details");
				System.out.println("4. Delete a user");
				int choice= sc.nextInt();
			 
		
				switch (choice) {
				case 1:
//                       Adding Employee details
					
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
					
					Configuration cfg = new Configuration();
					cfg.configure("hibernate.cfg.xml");
					
					//Creating Session Factory
					SessionFactory factory =cfg.buildSessionFactory();
					
					
					//Initialize Session Object
					Session session = factory.openSession();
					session.beginTransaction();

					Employee e = new Employee( empid,ename,deptno,designation,dateOfBirth,salary);
				    session.save(e);
				    session.getTransaction().commit();
				  
				//    session.close();
				    System.out.println("Employee table created......");
				    break;


				case 2:
					/*updating Employee Details */
					Configuration cfg1 = new Configuration();
					cfg1.configure("hibernate.cfg.xml");
					

					//Creating Session Factory
					SessionFactory factory1 =cfg1.buildSessionFactory();
					Session session2 =factory1.openSession();
					System.out.println("Enter Employee ID");
					int empId3 = sc.nextInt();
					Employee emp2 =  (Employee)session2.get(Employee.class, empId3);
					System.out.println("1:Update name\n2:Update Designation\n3:Update Department Number\n4: Update Date of Birth\n5:Update Salary ");
					System.out.println("Enter the Choice");
					int choice1 =sc.nextInt();
					if (choice1==1) {
						System.out.println("Enter Name");
						String name3 = sc.next();
						emp2.setName(name3);
						System.out.println("Employee Name Updated Sucesfull");
					}else if (choice1==2) {
						System.out.println("Enter Designation");
						String designation3 = sc.next();
						emp2.setDesignation(designation3);
						System.out.println("Employee Designation Updated Sucesfull");
					}else if (choice1==3) {
						System.out.println("Enter Department Number");
						int deptNo3 = sc.nextInt();
						emp2.setDeptno(deptNo3);
						System.out.println("Department Number Updated Sucesfull");
					}else if (choice1==4) {
						System.out.println("Enter Date of Birth");
						String dob3 = sc.next();
						emp2.setDateOfBirth(dob3);
						System.out.println("Date of Birth Updated Sucesfull");
					}else if (choice1==5) {
						System.out.println("Enter Name");
						double salary3 = sc.nextDouble();
						emp2.setSalary(salary3);
						System.out.println("Salary Updated Sucesfull");
					} else {
						System.out.println("Invalid Choice");
					}
					session2.beginTransaction();
					session2.update(emp2);
					session2.getTransaction().commit();
					break;
					
	

				case 3:
					/*
					 * Displaying  Employee Details
					 */
					System.out.println("Enter Employee Id");
					int id1 = sc.nextInt();
					Configuration cfg2 = new Configuration();
					cfg2.configure("hibernate.cfg.xml");
					

					//Creating Session Factory
					SessionFactory sessionFactory3 = cfg2.buildSessionFactory();

					//Initialize Session Object
					Session session3 = sessionFactory3.openSession();
					Employee emp3 = session3.get(Employee.class, id1 );//
					System.out.println(emp3);
					break;

		

				case 4:
					//Deleting Employee
					Configuration cfg3 = new Configuration();
					cfg3.configure("hibernate.cfg.xml");
					
					SessionFactory sessionFactory4 = cfg3.buildSessionFactory();
					Session session4 =sessionFactory4 .openSession();
				     
				 System.out.println("Enter the Employee  id to  perform delete operation: ");
				 int id4 = sc.nextInt();		  
					   
					      Employee emp4 =  session4.get(Employee.class,id4);
					      
					      session4.delete(emp4);
					     
					      System.out.println("Deleted Successfully");
					      break;
						   
				default:
					System.out.println("Please select the correct choice");
					System.exit(0);
				}
			}
		
			else if(input==2)
			{
				System.out.println("=========Department Table MENU=================");
				System.out.println("1. Create a new user");
				System.out.println("2. See a user");    
				System.out.println("3. Update a user information");
				System.out.println("4. Delete a user");
			}
			else {
				System.out.println("Invalid .....Please select valid choice");
			}

		}
			
		}

	}


