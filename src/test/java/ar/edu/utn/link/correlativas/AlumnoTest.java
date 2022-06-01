package ar.edu.utn.link.correlativas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.utn.link.correlativas.model.Alumno;
import ar.edu.utn.link.correlativas.model.Curso;
import ar.edu.utn.link.correlativas.model.Materia;

public class AlumnoTest {

	@Test
	public void testInscripcionOK() throws Exception {
		// Pre
		Alumno alumno = new Alumno("Ezequiel");
		Curso curso = new Curso( new Materia("SO", 1),2022  );
				
		//operatoria
		alumno.inscribir(curso);
		
		//postcond
		assertTrue( curso.estaIncripto(alumno) );
		
	}
	
	public void testInscripcionFaltaCorrelativa() throws Exception {
		
	}
	
	
}
