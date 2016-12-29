package com.zigong;

import com.zigong.model.User;
import com.zigong.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	@Autowired
	private UserService userService;

	@Test
	public void registerTest() {
		User user = new User();
		user.setUserName("自贡市政府");
		user.setUserPassword("dsafewr4324321dw");
		boolean result = userService.register(user);
		Assert.assertEquals(true,result);
	}
	@Test
	public void loginTest() {
		User user = new User();
		user.setUserId(1);
		user.setUserName("自贡市政府");
		user.setUserPassword("dsafewr4324321dw");
		User result = userService.login(user);
		Assert.assertNotNull(result);
	}
	@Test
	public void xiuGaiMima() {
		User user = new User();
		user.setUserId(1);
		user.setUserName("自贡市政府");
		user.setUserPassword("dsafewr4324321dw1");
		User user1 = new User();
		user1.setUserId(1);
		user1.setUserName("自贡市政府");
		user1.setUserPassword("dsafewr4324321dw");
		boolean result = userService.xiuGaiMima(user,user1);
		Assert.assertEquals(true,result);
	}

	@Test
	public void xiuGaiOther() {
		User user = new User();
		user.setUserId(1);
		user.setUserAddress("自贡市招商办");
		user.setUserPhone("2434321321");
		User user1 = new User();
		user1.setUserId(1);
		boolean result = userService.xiuGaiMima(user,user1);
		Assert.assertEquals(true,result);
	}

}
