package one.digitalinnovation.live.dioprojetopontoacesso.service;

import one.digitalinnovation.live.dioprojetopontoacesso.exception.ResourceNotFoundException;
import one.digitalinnovation.live.dioprojetopontoacesso.model.JornadaTrabalho;
import one.digitalinnovation.live.dioprojetopontoacesso.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public JornadaTrabalho findById(long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada)
                .orElseThrow(() -> new ResourceNotFoundException("Nenhuma jornada de trabalho encontrada."));
    }

    public void deleteById(long idJornada) {
        JornadaTrabalho jornadaTrabalho = this.findById(idJornada);
        jornadaTrabalhoRepository.delete(jornadaTrabalho);

    }
}
