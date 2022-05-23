package ar.edu.utn.link.correlativas.app;

import ar.edu.utn.link.correlativas.model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping(value = "/materia")
public class UIMateriasController {

    @Autowired
    public RepoMateriaMem repo;

    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String saveStudent(Model model) {
        model.addAttribute("lista_materias",repo.all());
        return "materias";
    }

    @GetMapping("/{nombre}")
    public String get(@PathVariable("nombre") String nombreMateria,Model model) {
        Materia byName = repo.findByName(nombreMateria);
        model.addAttribute("materia", byName);
        return "materia";


    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.POST)
    public RedirectView save(@ModelAttribute Materia materia, BindingResult errors) throws MateriaRepetidaException {
        if(! errors.hasErrors()){
            repo.save(materia);
        } else {
            // TODO informar error
        }

        return new RedirectView("/materia");
    }

}
