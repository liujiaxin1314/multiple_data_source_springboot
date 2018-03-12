package cn.jxliu.datasource;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * MyBatis映射配置文件路径类
 * 
 * @author jxliu
 * 
 */
@Configuration
@MapperScan(basePackages = "cn.jxliu.dao", sqlSessionFactoryRef = "mybatisSessionFactory")
public class MyabitsConfig {
	@Bean
	@Primary
	public DynamicDataSource dataSource(@Qualifier("mybatisDS") DataSource mybatisDS,@Qualifier("oracleDS") DataSource oracleDS) {
		Map<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put(DatabaseType.mybatisDS, mybatisDS);
		targetDataSources.put(DatabaseType.oracleDS, oracleDS);
		DynamicDataSource dataSource = new DynamicDataSource();
		dataSource.setTargetDataSources(targetDataSources);// 该方法是AbstractRoutingDataSource的方法
		dataSource.setDefaultTargetDataSource(mybatisDS);// 默认的datasource设置为myTestDbDataSource

		return dataSource;
	}

	@Bean(name = "mybatisSessionFactory")
	@Primary
	public SqlSessionFactory oracleSessionFactory(DataSource datasource,
			ApplicationContext applicationContext) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFactory
				.setMapperLocations(resolver.getResources("classpath:cn/jxliu/mybatis/*.xml"));
		sessionFactory.setDataSource(datasource);
		return sessionFactory.getObject();
	}
}
