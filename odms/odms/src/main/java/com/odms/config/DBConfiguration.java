package com.odms.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ConfigurationProperties("spring")
public class DBConfiguration {

 
	@Bean
	public DataSource dataSource() {

		 DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.h2.Driver");
	        dataSourceBuilder.url("jdbc:h2:mem:test");
	        dataSourceBuilder.username("SA");
	        dataSourceBuilder.password("");
	        return dataSourceBuilder.build();
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
