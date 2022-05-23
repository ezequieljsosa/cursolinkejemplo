package ar.edu.utn.link.correlativas.model;

import java.util.Collection;
import java.util.List;

public class Alumno {
	

	private String nombre;
	private List<Curso> cursos;
	private Collection<Materia>  materiasAprovadas;
	
		
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public Collection<Materia> getMateriasAprovadas() {
		return  materiasAprovadas;
	}
	public void setMateriasAprovadas(Collection<Materia> materiasAprovadas) {
		this.materiasAprovadas = materiasAprovadas;
	}

	public void inscribir(Curso curso) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
