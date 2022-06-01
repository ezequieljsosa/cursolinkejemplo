package ar.edu.utn.link.correlativas.app;

import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.utn.link.correlativas.model.Alumno;
import ar.edu.utn.link.correlativas.model.Curso;
import ar.edu.utn.link.correlativas.model.InscripcionInvalidaException;

@RepositoryRestController
public class CursoControllerComplement {
	
	@Autowired
	private RepoCurso repoCurso;
	@Autowired
	private AlumnoRepository repoAlumno;
	
	@RequestMapping(method = RequestMethod.POST,value="/cursos/{cursoId}/inscribir")
	public @ResponseBody ResponseEntity<Object> inscribir(@PathVariable("cursoId") Integer cursoId,
			 @RequestBody  Integer alumnoId){
		Optional<Curso> cursoOptional = repoCurso.findById(cursoId);
		if (! cursoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Optional<Alumno> alumnoOptional = repoAlumno.findById(alumnoId);
		if (! alumnoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso curso = cursoOptional.get();
		Alumno alumno = alumnoOptional.get();
		try {
			alumno.inscribir(curso);
		} catch (InscripcionInvalidaException e) {
			return ResponseEntity.badRequest().body(e.getMessage());		
		}
		return ResponseEntity.ok(curso);
	}
	
	
}
