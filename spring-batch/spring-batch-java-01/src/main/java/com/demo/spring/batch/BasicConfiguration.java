package com.demo.spring.batch;

import java.net.MalformedURLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
public class BasicConfiguration {

	@Value("org/springframework/batch/core/schema-drop-sqlite.sql")
	private Resource dropRepositoryTables;

	@Value("org/springframework/batch/core/schema-sqlite.sql")
	private Resource dataRepositorySchema;
	
	@Value("data/schema-create-sqlite.sql")
	private Resource userRepositorySchema;
	
	@Bean("dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite:db/spring_batch_sqlite.db");

		return dataSource;
	}
	
	@Bean
	public DataSourceInitializer dataSourceInitializer(DataSource dataSource) throws MalformedURLException {
		ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();

		databasePopulator.addScript(dropRepositoryTables);
		databasePopulator.addScript(dataRepositorySchema);
		databasePopulator.addScript(userRepositorySchema);
		databasePopulator.setIgnoreFailedDrops(true);

		DataSourceInitializer initializer = new DataSourceInitializer();
		initializer.setDataSource(dataSource);
		initializer.setDatabasePopulator(databasePopulator);

		return initializer;
	}
}