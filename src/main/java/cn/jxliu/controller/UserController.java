package cn.jxliu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jxliu.model.User;
import cn.jxliu.service.UserService;
import cn.jxliu.util.ErrorCodeType;
import cn.jxliu.util.ResultEntity;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/queryUser")
	@ResponseBody
	public ResultEntity queryUser(int user_id){
		ResultEntity res = new ResultEntity();
		User user = service.queryUser(user_id);
		System.out.println(user.getUser_id()+"    "+user.getUser_name()+"    "+user.getUser_password()+"    "+user.getUser_code());
		res.setData(user);
		res.setErrorCode(ErrorCodeType.SUCCESS);
		res.setMessage("查询成功!");
		return res;
	}
}
