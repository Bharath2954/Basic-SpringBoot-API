package com.bharath.cnproject;

import java.util.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class CnprojectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CnprojectApplication.class, args);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.nextLine();
		System.out.println("Select Department:\n1.Payment Department\n2.Sales Department\n3.Query Department");
		String dept = s.nextLine();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("contextApplication.xml");
		if(dept.equals("Payement Department"))
		{
			CustomerCare pay = (CustomerCare) context.getBean("paymentDept");
			pay.setCustomerName(name);
			pay.getService();
			System.out.println("Let us know your problem:");
			String prob = s.nextLine();
			pay.setProblem(prob);
			pay.getProblem();
		}
		else if(dept.equals("Sales Department"))
		{
			CustomerCare sales = (CustomerCare) context.getBean("salesDept");
			sales.setCustomerName(name);
			sales.getService();
			System.out.println("Let us know your problem:");
			String prob = s.nextLine();
			sales.setProblem(prob);
			sales.getProblem();
		}
		else if(dept.equals("Query Department"))
		{
			CustomerCare query = (CustomerCare) context.getBean("queryDept");
			query.setCustomerName(name);
			query.getService();
			System.out.println("Let us know your problem:");
			String prob = s.nextLine();
			query.setProblem(prob);
			query.getProblem();
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
