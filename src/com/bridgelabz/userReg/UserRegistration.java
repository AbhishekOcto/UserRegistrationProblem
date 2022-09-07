package com.bridgelabz.userReg;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);
	
	public void firstName() {
		System.out.print("Enter First Name: " );
        String FirstName = sc.next();
        boolean result = Pattern.matches("[A-Z][a-z]{2,}",FirstName);  //First name starts with Cap and has minimum 3 characters
        if (result)
        	System.out.println("Success");
        else 
            System.out.println("Please enter valid first name");
	}

}
