
package com.example.configurationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationServiceApplication implements CommandLineRunner {
	/*@Value("${ENCRYPT_KEY}")
	private String key;*/
	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("================= " + System.getenv("JAVA_HOME") + " ==========");
		System.out.println("================= " + System.getenv("ENCRYPT_KEY") + " ==========");
		System.out.println("========= " + System.getenv("encrypt.key") + " ==================");
		System.out.println("========= " + env.getProperty("ENCRYPT_KEY") + " ==================");
		System.out.println("========= " + env.getProperty("encrypt.key") + " ==================");
	}
}
