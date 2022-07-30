package com.cmp.app;

import java.util.Scanner;

import com.cmp.model.Cab;
import com.cmp.repository.impl.CabRepository;
import com.cmp.repository.impl.CityRepository;
import com.cmp.services.impl.CabRegistrationService;

public class AdminPortal {

	public void diplay() {
		while (true) {
			System.out.println("#####Welcome to CAB management admin portal#####");
			System.out.println("Choose one of the options");
			System.out.println("[1] Register new Cab");
			System.out.println("[2] Onboard new City");
			System.out.println("[3] Change city of cab");
			System.out.println("[4] Change state of Cab");
			System.out.println("[5] Exit Admin portal...");
			try(Scanner sc = new Scanner(System.in)){
				int option = sc.nextInt();
				switch(option) {
					case 1:
						Cab cab = new Cab(null, null, null);
						
						new CabRegistrationService(CabRepository.getInstance(CityRepository.CITY_REPOSITORY)).registerNewCab(cab);
						break;
					case 2:
						break;
					case 3:
						break;
					case 4: 
						break;
					case 5: 
						return;
					default:
						break;
				}
			}
		}
	}

}
