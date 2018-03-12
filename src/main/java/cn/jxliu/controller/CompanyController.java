package cn.jxliu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jxliu.model.Company;
import cn.jxliu.model.User;
import cn.jxliu.service.CompanyService;
import cn.jxliu.util.ErrorCodeType;
import cn.jxliu.util.ResultEntity;

@RequestMapping("/company")
@Controller
public class CompanyController {
	@Autowired
	private CompanyService service;
	
	@ResponseBody
	@RequestMapping("/queryCompany")
	public ResultEntity query(String compid){
		ResultEntity res = new ResultEntity();
		Company company = service.queryCompany(compid);
		System.out.println(company.getCompid()+"    "+company.getCompname()+"    "+company.getPermitword());
		res.setData(company);
		res.setErrorCode(ErrorCodeType.SUCCESS);
		res.setMessage("查询成功!");
		return res;
	}
}
