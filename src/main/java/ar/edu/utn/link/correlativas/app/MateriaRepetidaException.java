package ar.edu.utn.link.correlativas.app;

import ar.edu.utn.link.correlativas.model.Materia;

public class MateriaRepetidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Materia materia;

	public MateriaRepetidaException(Materia materia) {
		this.materia = materia;
	}

	public MateriaRepetidaException() {
		super();
	}

	public MateriaRepetidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MateriaRepetidaException(String message, Throwable cause) {
		super(message, cause);
	}

	public MateriaRepetidaException(String message) {
		super(message);
	}

	public MateriaRepetidaException(Throwable cause) {
		super(cause);
	}

	public Materia getMateria() {
		return materia;
	}
	
	
	
}
