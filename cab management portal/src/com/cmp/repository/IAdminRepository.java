package com.cmp.repository;

import com.cmp.model.Admin;

public interface IAdminRepository {

	public void insert(Admin admin);

	public Admin getAdmin(String id);

}
