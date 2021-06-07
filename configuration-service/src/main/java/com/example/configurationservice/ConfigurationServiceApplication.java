
package com.example.configurationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationServiceApplication implements CommandLineRunner {
	/*@Value("${ENCRYPT_KEY}")
	private String key;*/

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServiceApplication.class, args);
		System.out.println(
				"======================== " + System.getenv("JAVA_HOME") + " ==============================");
//				"======================== " + System.getenv("ENCRYPT_KEY") + " ==============================");
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("======================== " + key + " ==============================");
	}
}
