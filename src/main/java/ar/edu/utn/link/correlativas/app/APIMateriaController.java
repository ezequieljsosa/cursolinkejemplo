package ar.edu.utn.link.correlativas.app;


import java.util.ArrayList;

import java.util.List;


import ar.edu.utn.link.correlativas.model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("api/materias")
public class APIMateriaController {
	
	@Autowired
	private RepoMateriaMem repo;
	
	@GetMapping("")
	public Page<Materia> list(@RequestParam(value="anio",required = false)  Integer anio,
							  Pageable pagina) {
		
		if(anio == null) {
			//System.out.println(page);
			int offset = pagina.getPageNumber()* pagina.getPageSize();
			List<Materia> filtado = new ArrayList<Materia>(repo.all()).subList(offset,
					offset + pagina.getPageSize());
			Page<Materia> page = new PageImpl<>(filtado);
			return page;
		} else {
			return new PageImpl<>( new ArrayList<>(repo.findByYear(anio)));
		}
		
	}
	
	@GetMapping("/{nombre}")
	public Materia get(@PathVariable("nombre") String nombreMateria) {		
		return repo.findByName(nombreMateria) ;
	}
	
	@PostMapping("")
	public String post(@RequestBody Materia materia) 
			throws MateriaRepetidaException {		
		
		repo.save(materia) ;
		return "ok";
		
	}
	
}
