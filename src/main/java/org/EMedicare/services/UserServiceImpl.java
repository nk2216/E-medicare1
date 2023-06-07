package org.EMedicare.services;

import org.EMedicare.dao.UserRepository;
import org.EMedicare.entity.AuthenticationStatus;
import org.EMedicare.entity.User;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
private UserRepository userRepository;

public UserServiceImpl(UserRepository userRepository) {
	super();
	this.userRepository = userRepository;
	
}
	@Override
	public void insertUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public AuthenticationStatus getStatus(String username, String password) {
		AuthenticationStatus status;
		User user=userRepository.findByUsernameAndPassword(username, password);
		if(user!=null) {
			status=new AuthenticationStatus(user.getUsername(), user.getPassword(), true);
		}
		else
		{
			status=new AuthenticationStatus(null,null,false);
		}
		return status;
		
	}

}
