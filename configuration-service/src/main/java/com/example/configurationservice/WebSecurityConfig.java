package com.example.configurationservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//@formatter:off
		http
	        .csrf().disable()
	        .antMatcher("/**")
	        .authorizeRequests()
	        .anyRequest().authenticated()
	        .and()
	        .httpBasic();

		//@formatter:on

	}

}