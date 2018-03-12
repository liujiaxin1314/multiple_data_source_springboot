package cn.jxliu.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 多数据源配置
 * 
 * @author jxliu
 * 
 */
@Configuration
public class DataSourceConfig {
	
	@Bean(name = "mybatisDS")
	@ConfigurationProperties(prefix = "datasource.mysql")
	public DataSource mybatisDataSource() {
		return DataSourceBuilder.create().build();
	}


	// oracle数据源
	@Bean(name = "oracleDS")
	@ConfigurationProperties(prefix = "datasource.oracle")
	public DataSource oracleDataSource() {
		return DataSourceBuilder.create().build();
	}

}
