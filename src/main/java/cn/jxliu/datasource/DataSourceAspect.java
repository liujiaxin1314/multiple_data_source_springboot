package cn.jxliu.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 配置AOP切面
 */
@Aspect
@Component
public class DataSourceAspect {
	
	@Before("execution(* cn.jxliu.dao.*.*(..))")
	public void setDataSourceKey(JoinPoint point) {
		DatabaseContextHolder.setDatabaseType(DatabaseType.mybatisDS);
	}
	
	@Before("execution(* cn.jxliu.oracle.*.*(..))")
	public void setDataSourceKey1(JoinPoint point) {
		DatabaseContextHolder.setDatabaseType(DatabaseType.oracleDS);
	}

}