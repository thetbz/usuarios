package com.example.demo.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private BCryptPasswordEncoder passEnconder;

	public void configurerSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception {

		builder.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passEnconder)
				.usersByUsernameQuery("SELECT nombre, contrasenia, enabled FROM usuarios WHERE nombre=?");

	}
}
