package org.EMedicare.services;

import org.EMedicare.entity.AuthenticationStatus;
import org.EMedicare.entity.User;


public interface UserService {
 void insertUser(User user);
 AuthenticationStatus getStatus(String username,String password);
}
