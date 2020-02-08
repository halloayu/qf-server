package com.yzeng.qf;

import com.yzeng.qf.pojo.model.UserDomain;
import com.yzeng.qf.service.user.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QfServerApplicationTests {

	@Autowired
	UserServiceImpl userService;

	@Test
	void contextLoads() {
		UserDomain user = userService.getUserInfoById(1);
		System.out.println(user.getUsername());
		System.out.println(user.getLevel());
	}

}