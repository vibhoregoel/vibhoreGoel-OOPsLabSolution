package com.vibhoregoel.MainDriver;

import java.util.Scanner;

import com.vibhoregoel.CredentialService.Services;

public class Mains {

	public static String dept = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Services serv = new Services();
		System.out.println("Press 1 if your department is TECHNICAL");
		System.out.println("Press 2 if your department is ADMINSTRATOR");
		System.out.println("Press 3 if your department is HUMAN RESOURCE");
		System.out.println("Press 4 if your department is LEGAL");
		int option = sc.nextInt();
		System.out.println("Dear user your generated credentials are as follows");
		System.out.println();
		switch (option) {
		case 1: {
			dept = "technical";
			String name = serv.generateEmailAddress();
			System.out.println("Email-----> " + name);
			String password = serv.generatePassword();
			System.out.println("Password-----> " + password);
		}
			break;
		case 2: {
			dept = "admin";
			String name = serv.generateEmailAddress();
			System.out.println("Email-----> " + name);
			String password = serv.generatePassword();
			System.out.println("Password-----> " + password);

		}
			break;
		case 3: {
			dept = "hr";
			String name = serv.generateEmailAddress();
			System.out.println("Email-----> " + name);
			String password = serv.generatePassword();
			System.out.println("Password-----> " + password);
		}
			break;
		case 4: {
			dept = "legal";
			String name = serv.generateEmailAddress();
			System.out.println("Email-----> " + name);
			String password = serv.generatePassword();
			System.out.println("Password-----> " + password);
		}

		}

	}
}
