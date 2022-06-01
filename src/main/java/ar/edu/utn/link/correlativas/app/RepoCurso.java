package ar.edu.utn.link.correlativas.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.link.correlativas.model.Curso;

@RepositoryRestResource(path = "cursos")
public interface RepoCurso extends JpaRepository<Curso, Integer> {

	

}
