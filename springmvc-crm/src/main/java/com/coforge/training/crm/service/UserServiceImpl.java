package com.coforge.training.crm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.crm.dao.UserDao;
import com.coforge.training.crm.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public User checkUser(User theUser) {
		
		return userDao.checkUser(theUser);
	}

}
