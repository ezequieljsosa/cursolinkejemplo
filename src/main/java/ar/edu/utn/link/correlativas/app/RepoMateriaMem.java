package ar.edu.utn.link.correlativas.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import ar.edu.utn.link.correlativas.model.Materia;

@Repository
public class RepoMateriaMem implements RepoMateria {

	private Collection<Materia> materias;

	public RepoMateriaMem() {
		super();
		List<Materia> of = List.of( new Materia("Algoritmos",1), new Materia("Sintaxis",2),  
				new Materia("Diseño",3), new Materia("SO",3));
		materias = new ArrayList<Materia>(of);
	}
	
	public Collection<Materia> all(){
		return materias;
	}

	public Materia findByName(String nombreMateria) {
		return materias.stream().filter(x -> x.getNombre().equals(nombreMateria)).findFirst().get();
	}

	public Collection<Materia> findByYear(Integer anio) {
		return materias.stream().filter(x -> x.getAnio().equals(anio)
				).collect(Collectors.toList());
	}

	public void save( Materia materia) throws MateriaRepetidaException {
		
		if(materias.contains(materia)) {
			throw new MateriaRepetidaException(materia);
		}
		
		this.materias.add(materia);
		
	}
	
	
	
}
