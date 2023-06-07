package org.EMedicare.services;

import org.EMedicare.dao.ContactUsRepository;
import org.EMedicare.entity.ContactUs;
import org.springframework.stereotype.Service;

@Service
public class ContactUsServiceImpl implements ContactUsService {
private ContactUsRepository contactUsRepository;

public ContactUsServiceImpl(ContactUsRepository contactUsRepository) {
	super();
	this.contactUsRepository = contactUsRepository;
}

@Override
public void insertMsg(ContactUs contactUs) {
	contactUsRepository.save(contactUs);
	
}

}
