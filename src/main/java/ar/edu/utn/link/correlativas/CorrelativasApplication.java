package ar.edu.utn.link.correlativas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorrelativasApplication {

	private static Logger LOG = LoggerFactory.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		System.out.println("hola");
		SpringApplication.run(CorrelativasApplication.class, args);
	}

}
