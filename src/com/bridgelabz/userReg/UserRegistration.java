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

}
