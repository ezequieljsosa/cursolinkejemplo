package ar.edu.utn.link.correlativas.app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(MateriaRepetidaException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.CONFLICT)
	public String repetido(MateriaRepetidaException ex) {
		return "la materia " + ex.getMateria().getNombre() + " ya existe....";
	}

}
