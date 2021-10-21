package com.htp.skp.db2.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "db2EntityManagerFactory", transactionManagerRef = "db2TransactionManager", basePackages = {
		"com.htp.skp.db2.service" })
public class DB2DBConfig {

	@Bean(name = "db2Datasource")
	@ConfigurationProperties(prefix = "spring.datasource.db")
	public DataSource dataSource() {
		try {
			return DataSourceBuilder.create().build();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Bean(name = "db2EntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
			@Qualifier("db2Datasource") DataSource dataSource) {
		try {
			Map<String, Object> properties = new HashMap<>();
//			properties.put("hibernate.hbm2ddl.auto", "update");
			properties.put("hibernate.dialect", "org.hibernate.dialect.DB2Dialect");

			return builder.dataSource(dataSource).properties(properties).packages("com.htp.skp.db2.entity").build();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Bean(name = "db2TransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("db2EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		try {
			return new JpaTransactionManager(entityManagerFactory);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
