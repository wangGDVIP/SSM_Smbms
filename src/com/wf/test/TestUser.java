package com.wf.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wf.entity.User;
import com.wf.service.UserService;

public class TestUser {
	
//	ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
//	UserService userService = (UserService)ctx.getBean("userService");
	
	
//	@Test
//	public void getUserCount(){
//		try {
//			int count = userService.getUserCount();
//			System.out.println(count);
//			Assert.assertEquals(true, count > 0);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	public void findUser(){
//		User user = new User();
//		user.setUserCode("admin");
//		user.setUserPassword("123");
//		User loginUser = userService.findUser(user);
//		Assert.assertEquals(true, user.getUserCode().equals(loginUser.getUserCode()));
//	}
	
//	@Test
//	public void addUser(){
//		User user;
//		try {
//			user = new User("test001", "�����û�001", "1234567", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1984-12-12"), 
//					"13688783697", "��ַ����", 4, 1, new Date(), null, null);
//			int count = userService.addUser(user);
//			Assert.assertEquals(true, count > 0);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	public void updateUser(){
//		User user;
//		try {
//			user = new User(16,"test001", "�����û�001", "1234567", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1984-12-12"), 
//					"13688783697", "��ַ����", 4, 1, new Date(), null, null);
//			int count = userService.updateUser(user);
//			Assert.assertEquals(true, count > 0);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	public void deleteUser(){
//		try {
//			int count = userService.deleteUser(16);
//			Assert.assertEquals(true, count > 0);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
}
