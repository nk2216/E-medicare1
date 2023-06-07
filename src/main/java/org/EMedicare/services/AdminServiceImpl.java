package org.EMedicare.services;

import org.EMedicare.dao.AdminRepository;
import org.EMedicare.entity.Admin;
import org.EMedicare.entity.AdminAuthenticationStatus;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl implements AdminService{
private AdminRepository adminRepository;


	public AdminServiceImpl(AdminRepository adminRepository) {
	super();
	this.adminRepository = adminRepository;
}

	@Override
	public void insertAdmin(Admin admin) {
		adminRepository.save(admin);
		
	}

	@Override
	public AdminAuthenticationStatus getAdminStatus(String admin, String password) {
		AdminAuthenticationStatus authStatus;
		Admin admin1=adminRepository.findByAdminAndPassword(admin, password);
		if(admin1!=null) {
			authStatus=new AdminAuthenticationStatus(admin1.getAdmin(),admin1.getPassword(),true);
		}else {
			authStatus=new AdminAuthenticationStatus(null,null,false);
		}
		return authStatus;
	}

}
