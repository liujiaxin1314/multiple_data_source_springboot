package cn.jxliu.oracle.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.jxliu.model.Company;
import cn.jxliu.oracle.CompanyMapper;

public class CompanyMapperImpl implements CompanyMapper {
	@Autowired
	private CompanyMapper mapper;
	@Override
	public Company queryCompany(String compid) {
		return mapper.queryCompany(compid);
	}

}
