package com.bridgelabz.userReg;
import java.util.Scanner;

public class UserRegistrationMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to user registration program");
		UserRegistration userReg = new UserRegistration();
		int option;
		while (true) {
		System.out.print("1.First Name\n2.Last Name\n3.Email\n4.Phone Number\n5.Enter Password\n6.Exit");
		System.out.println("\nEnter option number: ");
		option = sc.nextInt();
		
		switch(option){
		case 1:
			userReg.firstName();
			break;
		case 2:
			userReg.lastName();
			break;
		case 3:
			userReg.email();
			break;
		case 4:
			userReg.contactNumber();
			break;
		case 5:
			userReg.Password();
		case 6:
			System.exit(0);
			break;
		   }
		
		}
		
	}
	

}
