package com.cmp.app;

import java.util.Scanner;

public class MainPortal {

	public static void main(String[] args) {
		while(true) {
			System.out.println("#####CAB Booking System#####");
			System.out.println("Choose one of below accounts login");
			System.out.println("[1] for Admin");
			System.out.println("[2] for Customer");
			System.out.println("[3] for Exit");
			try (Scanner sc = new Scanner(System.in);) {
				int account = sc.nextInt();
				switch (account) {
				case 1:
					new AdminPortal().diplay();
					break;
				case 2:
					new CustomerPortal().diplay();
					break;
				case 3:
				default:
					System.out.println("Exiting...");

				}
			}
		}
		

	}

}
