package com.cmp.factory;

import com.cmp.enums.AuthType;
import com.cmp.repository.impl.AdminRepository;
import com.cmp.repository.impl.CustomerRepository;
import com.cmp.services.IAuthenticationService;
import com.cmp.services.impl.AdminAuthenticationService;
import com.cmp.services.impl.CustomerAuthenticationService;

public class AuthenticatorFactory {
	
	public static IAuthenticationService getAuthenticationService(AuthType type) {
		switch(type) {
			case CUSTOMER:
				return new CustomerAuthenticationService(CustomerRepository.getInstance());
			case ADMIN:
				return new AdminAuthenticationService(AdminRepository.getInstance());
			default:
				return null;				
		}
				
	}

}
