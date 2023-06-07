package org.EMedicare.controller;

import java.util.List;

import org.EMedicare.entity.Admin;
import org.EMedicare.entity.AdminAuthenticationStatus;
import org.EMedicare.entity.Medicines;
import org.EMedicare.services.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AdminController {
private AdminService adminService;

public AdminController(AdminService adminService) {
	super();
	this.adminService = adminService;
}
@PostMapping("/admins")
public ResponseEntity insert(@RequestBody Admin admin) {
	adminService.insertAdmin(admin);
	return new ResponseEntity<>(HttpStatus.CREATED);
}

@PostMapping("/admin")
public ResponseEntity<AdminAuthenticationStatus> authenticate(@RequestBody Admin admin) {
	
	AdminAuthenticationStatus authStatus=adminService.getAdminStatus(admin.getAdmin(),admin.getPassword());
	return new ResponseEntity<AdminAuthenticationStatus>(authStatus,HttpStatus.ACCEPTED);
	
}
}
