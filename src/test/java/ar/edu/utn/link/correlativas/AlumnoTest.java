package ar.edu.utn.link.correlativas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlumnoTest {

	@Test
	public void testInscripcionOK() throws Exception {
		// Pre
		Alumno alumno = new Alumno("Ezequiel");
		Curso curso = new Curso( new Materia("SO"),2022  );
				
		//operatoria
		alumno.inscribir(curso);
		
		//postcond
		assertTrue( curso.estaIncripto(alumno) );
		
	}
	
	public void testInscripcionFaltaCorrelativa() throws Exception {
		
	}
	
	
}
