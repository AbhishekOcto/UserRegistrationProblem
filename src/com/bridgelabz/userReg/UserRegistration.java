package com.bridgelabz.userReg;
import java.util.Scanner;
import java.util.regex.*;

/*
 * @author : Abhishek
 * since : 06.09.22
 * */

public class UserRegistration {
	Scanner sc = new Scanner(System.in);
	
	public void firstName() { //method to enter first name UC1
		System.out.print("Enter First Name: " );
        String FirstName = sc.next();
        boolean result = Pattern.matches("[A-Z][a-z]{2,}",FirstName);  //First name starts with Cap and has minimum 3 characters
        if (result)
        	System.out.println("Success");
        else 
            System.out.println("Please enter valid first name");
	}
	
	public void lastName(){ //method to enter last name UC2
        System.out.print("Enter Last Name: " );
        String LastName = sc.next();
        Boolean result = Pattern.matches("[A-Z][a-z]{2,}",LastName);
        if (result)
        	System.out.println("Success");
        else 
            System.out.println("please enter valid last name ");
    }
	
	public void email(){ //method to enter valid emailId UC3
		/*Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
		precise @ and . positions
		 */
        	System.out.print("Enter email ID: " );
        	String Email = sc.next();
        	Boolean result = Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$",Email);
        		if (result)
        			System.out.println("Success");
        		else 
        			System.out.println("Please enter valid email Id");
					}
	}
