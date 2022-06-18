package com.sms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sms.Entity.Userlog;
import com.sms.Repository.UserloginReposirory;

@Service
public class UserloginService {

	@Autowired
	private UserloginReposirory repo;
	
	public void save(Userlog userlong) {
		 repo.save(userlong);
	}

}
