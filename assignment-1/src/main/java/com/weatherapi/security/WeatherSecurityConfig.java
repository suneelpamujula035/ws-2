package com.weatherapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WeatherSecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("suneel")
		.password(this.getPasswordEncode().encode("suneel123"))
		.roles("user");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.anyRequest().authenticated()
		//.antMatchers("/weather-client").authenticated()
		//.antMatchers("/getName").permitAll()
		//.formLogin().loginPage("/myCustomLogin").loginProcessingUrl("/process-login")
		.and()
		.formLogin()
		.and()
		.httpBasic()
		.and()
		.logout();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncode()
	{
		return new BCryptPasswordEncoder();
	}
	
	
}
