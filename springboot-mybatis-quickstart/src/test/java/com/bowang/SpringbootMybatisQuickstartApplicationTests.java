package com.bowang;

import com.bowang.mapper.UserMapper;
import com.bowang.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // springboot整合单元测试的注解
class SpringbootMybatisQuickstartApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testListUser() {
		List<User> userList = userMapper.list();
		userList.stream().forEach(user -> {
			System.out.println(user.toString());
		});
	}

}
