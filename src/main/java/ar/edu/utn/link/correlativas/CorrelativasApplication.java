package ar.edu.utn.link.correlativas;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ar.edu.utn.link.correlativas.app.MateriaRepetidaException;
import ar.edu.utn.link.correlativas.app.RepoMateria;
import ar.edu.utn.link.correlativas.model.Materia;


@EnableJpaRepositories
@Configuration
@SpringBootApplication
public class CorrelativasApplication {

	
	
	public static void main(String[] args) {
		
		SpringApplication.run(CorrelativasApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner init( @Qualifier("jpa") RepoMateria repo) {
//		return (args) -> {
//		
//			List.of( new Materia("Algoritmos",1), new Materia("Sintaxis",2),  
//					new Materia("Diseño",3), new Materia("SO",3)).stream().forEach(((m) -> {
//						try {
//							repo.save(m);
//						} catch (MateriaRepetidaException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}));
//			
//		};
//	}

}
