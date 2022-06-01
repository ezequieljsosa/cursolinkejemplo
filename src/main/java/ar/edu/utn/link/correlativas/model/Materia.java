package ar.edu.utn.link.correlativas.model;

import java.util.Collection;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;






@Entity
public class Materia {
	
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotBlank
	private String nombre;

	@Min(2000)
	private Integer anio;
	
	
	@Transient
	private Collection<Materia> correlativas;
	
	
	
	
	protected Materia() {
		super();
	}


	public Materia(String nombre,int anio) {
		super();
		this.nombre = nombre;
		this.anio = anio;
	}
	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Collection<Materia> getCorrelativas() { 
		return correlativas;
	}
	public void setCorrelativas(Collection<Materia> correlativas) {
		this.correlativas = correlativas;
	}


	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", anio=" + anio + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(nombre, other.nombre);
	}


	


	
	
	

}
