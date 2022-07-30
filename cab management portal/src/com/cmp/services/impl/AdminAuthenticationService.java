package com.cmp.services.impl;

import com.cmp.model.Admin;
import com.cmp.repository.IAdminRepository;
import com.cmp.services.IAuthenticationService;

public class AdminAuthenticationService  implements IAuthenticationService {
		
	private IAdminRepository adminRepository;
	
	public AdminAuthenticationService(IAdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}
	
	public boolean authenticate(String id, String password) {
		
		Admin admin = adminRepository.getAdmin(id);
		return admin.isAuthenticate(password);
	
	}

}
