package cn.jxliu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxliu.model.Company;
import cn.jxliu.oracle.CompanyMapper;
import cn.jxliu.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyMapper mapper;
	@Override
	public Company queryCompany(String compid) {
		return mapper.queryCompany(compid);
	}

}
