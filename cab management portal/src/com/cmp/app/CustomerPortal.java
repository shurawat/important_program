package com.cmp.app;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cmp.enums.AuthType;
import com.cmp.enums.CabType;
import com.cmp.exceptions.CabNotAvailableException;
import com.cmp.exceptions.CityNotFoundException;
import com.cmp.factory.AuthenticatorFactory;
import com.cmp.model.Cab;
import com.cmp.repository.ICabRepository;
import com.cmp.repository.ICityRepository;
import com.cmp.repository.ICustomerRepository;
import com.cmp.repository.impl.CabRepository;
import com.cmp.repository.impl.CityRepository;
import com.cmp.repository.impl.CustomerRepository;
import com.cmp.services.IAuthenticationService;
import com.cmp.services.impl.CabBookingService;

public class CustomerPortal {

	public void diplay() {
		System.out.println("#####Welcome to CAB management customer portal#####");
		System.out.println("#####Enter to customer user id (for testing enter 1)#####");
		System.out.println("#####Enter to customer password (default password is test)#####");
		try (Scanner sc = new Scanner(System.in);) {
			String id = sc.nextLine();
			String password = sc.nextLine();
			IAuthenticationService authService = AuthenticatorFactory.getAuthenticationService(AuthType.CUSTOMER);
			boolean isValid = authService.authenticate(id, password);
			if (!isValid) {
				System.err.println("User is not valid");
				return;
			} else {
				System.out.println("User " + id + " logged in successful");
			}
			while (true) {
				System.out.println("#####Select one of the operation#####");
				System.out.println("[1] Book a cab");
				System.out.println("[2] Exit...");
				int option = sc.nextInt();
				
				switch (option) {
				case 1:
					while(true) {
						System.out.println("#####Booking a cab#####");
						System.out.println();
						System.out.println("Enter cab type");
						System.out.print("Supported types " + Stream.of(CabType.values()).
				                map(CabType::name).
				                collect(Collectors.joining(", ")));
						System.out.println();
						String type = sc.next();
						System.out.println();
						if(type == null || type.equals("")) {
							System.err.println("cab type should not be empty");	
							break;
						}
						System.out.println("Enter source city " );
						System.out.println();
						String from = sc.next();
						if(from == null || from.equals("")) {
							System.err.println("source city should not be empty");	
							break;
						}
						
						System.out.println("Enter destination city ");
						System.out.println();
						String to = sc.next();
						if(to == null || to.equals("")) {
							System.err.println("destination city should not be empty");		
							break;
						}
						
						ICityRepository cityRepository = CityRepository.CITY_REPOSITORY;
						ICabRepository cabRepository = CabRepository.getInstance(cityRepository);
						ICustomerRepository customerRepository = CustomerRepository.getInstance();
						try {
							Cab cab = new CabBookingService(customerRepository, cabRepository, cityRepository)
							.bookCab(id, CabType.valueOf(type), from, to);
							System.out.println("Cab "+ cab.getId() +" booked Successful");
							System.out.println("Cab type "+ cab.getCabType().toString());
							break;
						} catch (CabNotAvailableException e) {
							System.err.println(e.getMessage());
						} catch (CityNotFoundException e) {
							System.err.println(e.getMessage());
						}
					}
					break;
				case 2:
					System.out.println("User exits the portal");
					return;
				default:
					System.err.println("Invalid option selected");
					break;
				}
			}

		}

	}

}
