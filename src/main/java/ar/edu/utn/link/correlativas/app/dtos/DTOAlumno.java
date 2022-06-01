package ar.edu.utn.link.correlativas.app.dtos;

import org.springframework.beans.factory.annotation.Value;

public interface DTOAlumno {
	 
	String getNombre();
	@Value("#{target.nombre} #{target.apellido}")
	String getNombreCompleto();
	
	@Value("#{target.materiasAprobadas.size()}")
	int getCantMateriasAprobadas();
	
	

}
