package net.vinayaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.vinayaka.*")

public class DemoAppApplication {



	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path","/SpringBootApp");
		SpringApplication.run(DemoAppApplication.class, args);
	}

}
