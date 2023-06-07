package org.EMedicare.dao;

import org.EMedicare.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
Admin findByAdminAndPassword(String admin,String password);
Admin findByAdminId(int adminId);
}
