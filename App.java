package com.anuja;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext	("spconfig.xml");
         Company company = (Company)applicationContext.getBean("comp");
         company.print();
         
     }
 }
   
