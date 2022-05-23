package ar.edu.utn.link.correlativas.app;

import java.util.Collection;



import ar.edu.utn.link.correlativas.model.Materia;


public interface RepoMateria {

	public Collection<Materia> all();

	public Materia findByName(String nombreMateria);

	public Collection<Materia> findByYear(Integer anio) ;

	public void save( Materia materia) throws MateriaRepetidaException ;
	
}
