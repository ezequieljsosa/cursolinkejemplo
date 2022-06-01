package ar.edu.utn.link.correlativas.model;

public class InscripcionInvalidaException extends Exception {

	private Alumno alumno;
	private Curso curso;
	
	public InscripcionInvalidaException(String message, Alumno alumno, Curso curso) {
		super(message);
		this.alumno = alumno;
		this.curso = curso;
		
	}

	public InscripcionInvalidaException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InscripcionInvalidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InscripcionInvalidaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InscripcionInvalidaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InscripcionInvalidaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
