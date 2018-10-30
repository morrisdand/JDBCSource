package com.morris.JDBCSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import(org.springframework.cloud.stream.app.jdbc.source.JdbcSourceConfiguration.class)
public class JdbcSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcSourceApplication.class, args);
	}
}
