package cn.jxliu.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * MyBatis映射配置文件路径类
 * 
 * @author jxliu
 * 
 */
@Configuration
@MapperScan(basePackages = "cn.jxliu.oracle", sqlSessionFactoryRef = "oracleSessionFactory")
public class OracleConfig {

	@Bean(name = "oracleSessionFactory")
	public SqlSessionFactory oracleSessionFactory(DataSource datasource,
			ApplicationContext applicationContext) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFactory
				.setMapperLocations(resolver.getResources("classpath:cn/jxliu/oracle/*.xml"));
		sessionFactory.setDataSource(datasource);
		return sessionFactory.getObject();
	}
}
