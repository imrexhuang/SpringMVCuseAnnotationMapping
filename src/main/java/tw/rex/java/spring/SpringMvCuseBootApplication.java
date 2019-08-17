package tw.rex.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan(basePackages={"tw.rex.java.spring.controller","tw.rex.java.spring.service"})
public class SpringMvCuseBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvCuseBootApplication.class, args);	
	}

}
