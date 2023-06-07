package org.EMedicare.dao;

import org.EMedicare.entity.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Integer>{

}
