package com.yzeng.qf;

import com.alibaba.fastjson.JSON;
import com.yzeng.qf.pojo.model.PictureDomain;
import com.yzeng.qf.pojo.model.UserDomain;
import com.yzeng.qf.service.PictureService;
import com.yzeng.qf.service.UserService;
import com.yzeng.qf.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class QfServerApplicationTests {

	@Autowired
	UserService userService;

	@Autowired
	PictureService pictureService;

	@Test
	void contextLoads() {
		List<UserDomain> user = userService.queryUsers("qf2");
		System.out.println(user);

//		List<PictureDomain> picture = pictureService.getPictureByProductId(13);
//		String pictureJson = JSON.toJSONString(picture);
//		System.out.println(pictureJson);
	}

}
