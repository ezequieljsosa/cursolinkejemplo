package ar.edu.utn.link.correlativas.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import ar.edu.utn.link.correlativas.model.Materia;


@Qualifier("jpa2")
public interface RepoMateria extends PagingAndSortingRepository<Materia, Integer> {

	List<Materia> findAll();
	Materia findByNombre(String nombre);
	
	Page<Materia> findByAnio(Integer anio,Pageable pageable);
	
	
	@SuppressWarnings("unchecked")
	Materia save(Materia m) throws MateriaRepetidaException;
	
}
