package cn.jxliu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxliu.dao.UserMapper;
import cn.jxliu.model.User;
import cn.jxliu.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	@Override
	public User queryUser(int user_id) {
		return mapper.queryUser(user_id);
	}

}
