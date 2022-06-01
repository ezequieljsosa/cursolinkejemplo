package ar.edu.utn.link.correlativas.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ar.edu.utn.link.correlativas.app.dtos.DTOAlumno;
import ar.edu.utn.link.correlativas.model.Alumno;


@RepositoryRestResource(path="alumnos",excerptProjection = DTOAlumno.class)
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

	@Override
	@RestResource(exported = false)
	void deleteById(Integer id) ;

	@Override
	@RestResource(exported = false)
	void delete(Alumno entity) ;


	
	
	
}
