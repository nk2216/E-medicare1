package org.EMedicare.services;

import java.util.List;

import org.EMedicare.entity.Admin;
import org.EMedicare.entity.AdminAuthenticationStatus;

public interface AdminService {
void insertAdmin(Admin admin);
AdminAuthenticationStatus getAdminStatus(String admin,String password);
static List<Admin> getAdminDetails() {
	// TODO Auto-generated method stub
	return null;
}
}
