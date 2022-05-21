package com.ty.shoppong.userService;

import java.util.List;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class Service {
	UserDao userDao=new UserDao();
	public User saveUserService(User user)
	{
		return userDao.saveUser(user);
	}
	
	public User getUserById(int id)
	{
		return userDao.getUserById(id);
	}
	
	public List<User> getAllUser()
	{
		return userDao.getAllUser();
	}
	
	public List<User> validateUser(String email,String password)
	{
		return userDao.validateUser(email, password);
	}
	
	public boolean deleteUser(int id)
	{
		return userDao.deleteUser(id);
	}
			

}
