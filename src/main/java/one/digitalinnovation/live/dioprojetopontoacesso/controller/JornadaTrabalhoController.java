package one.digitalinnovation.live.dioprojetopontoacesso.controller;

import one.digitalinnovation.live.dioprojetopontoacesso.exception.ResourceNotFoundException;
import one.digitalinnovation.live.dioprojetopontoacesso.model.JornadaTrabalho;
import one.digitalinnovation.live.dioprojetopontoacesso.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaTrabalhoList() {
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public JornadaTrabalho getJornadaTrabalhoById(@PathVariable("idJornada") long idJornada) {
        return jornadaTrabalhoService.findById(idJornada);
    }

    @PutMapping
    public JornadaTrabalho updateJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public void deleteJornadaTrabalhoById(@PathVariable("idJornada") long idJornada) {
        jornadaTrabalhoService.deleteById(idJornada);
    }
}
