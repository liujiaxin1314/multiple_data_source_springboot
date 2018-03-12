package cn.jxliu.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import cn.jxliu.dao.UserMapper;
import cn.jxliu.model.User;

public class UserMapperImpl implements UserMapper {
	@Autowired
	private UserMapper mapper;
	@Override
	public User queryUser(int user_id) {
		return mapper.queryUser(user_id);
	}

}
