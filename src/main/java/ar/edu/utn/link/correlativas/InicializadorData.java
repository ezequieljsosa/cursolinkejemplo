package ar.edu.utn.link.correlativas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.stereotype.Component;

import ar.edu.utn.link.correlativas.app.MateriaRepetidaException;
import ar.edu.utn.link.correlativas.app.RepoMateria;
import ar.edu.utn.link.correlativas.model.Materia;

@Component
public class InicializadorData implements CommandLineRunner {

	@Autowired
	@Qualifier("jpa2")
	RepoMateria repo;
	
	@Autowired
	RepositoryRestConfiguration config;
	
	@Override
	public void run(String... args) throws Exception {
//		config.getProjectionConfiguration().addProjection(AlumnoDTO2.class);
		config.exposeIdsFor(Materia.class);
		if (repo.count() == 0) { 
			List.of( new Materia("Algoritmos",2022), new Materia("Sintaxis",2021),  
					new Materia("Diseño",2022), new Materia("SO",2022)).stream().forEach(((m) -> {
						try {
							repo.save(m);
						} catch (MateriaRepetidaException e) {
							e.printStackTrace();
						}
					}));
		}
		
		
	}

	
	
}
