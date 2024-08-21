package br.com.ifba.gestaofaltas.service;

import br.com.ifba.gestaofaltas.repository.GestaoFaltasRepository;
import br.com.ifba.gestaofaltas.entity.Falta;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GestaoFaltasService implements GestaoFaltasIService {

    private final GestaoFaltasRepository gestaoFaltasRepository;

    @Override
    public Falta save(Falta attendance) {
        return gestaoFaltasRepository.save(attendance);
    }

    @Override
    public Falta update(Falta attendance) {
        return gestaoFaltasRepository.save(attendance); // Assume que o método save atualiza se já existir
    }

    @Override
    public void delete(Falta attendance) {
        gestaoFaltasRepository.delete(attendance);
    }

    @Override
    public Falta findById(Long id) {
        return gestaoFaltasRepository.findById(id).orElse(null);
    }

//    @Override
//    public List<Falta> findByStudentId(Long rg) {
//        return gestaoFaltasRepository.findByStudentId(rg);
//    }

    @Override
    public List<Falta> findAll() {
        return gestaoFaltasRepository.findAll();
    }
}
