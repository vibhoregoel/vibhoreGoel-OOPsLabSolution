package com.vibhoregoel.CredentialService;

import java.util.Random;

import com.vibhoregoel.MainDriver.Mains;

import com.vibhoregoel.EmployeeList.Employee;

public class Services {
	Employee emp = new Employee("rakesh", "agarwal");
	Mains main = new Mains();
	Random rn = new Random();

	public String generateEmailAddress() {
		return emp.getFirstname() + emp.getLastname() + "@" + main.dept + ".techinfo.com";

	}

	public String generatePassword() {

		String letters = "AbCdEfGhijKLMgNo";
		String special = "!@#$%^&*";
		String num = "1234567890";
		String value = letters + special + num;
		char[] pass = new char[8];
		for (int i = 0; i < 8; i++) {
			pass[i] = value.charAt(rn.nextInt(value.length()));
		}
		String x = String.valueOf(pass);
		return x;

	}

}
