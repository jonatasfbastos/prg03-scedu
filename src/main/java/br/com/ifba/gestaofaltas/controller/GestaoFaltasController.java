package br.com.ifba.gestaofaltas.controller;

import br.com.ifba.gestaofaltas.entity.Falta;
import br.com.ifba.gestaofaltas.service.GestaoFaltasIService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class GestaoFaltasController implements GestaoFaltasIController {

    // Injeta uma instância do serviço de faltas gerenciado pelo Spring
    private final GestaoFaltasIService attendanceService;

    // Salva uma falta utilizando o serviço e retorna a falta salva
    @Override
    public Falta save(Falta attendance) throws RuntimeException {
        return attendanceService.save(attendance);
    }

    // Atualiza uma falta utilizando o serviço e retorna a falta atualizada
    @Override
    public Falta update(Falta attendance) throws RuntimeException {
        return attendanceService.update(attendance);
    }

    // Exclui uma falta utilizando o serviço
    @Override
    public void delete(Falta attendance) throws RuntimeException {
        attendanceService.delete(attendance);
    }

    // Busca uma falta pelo seu ID utilizando o serviço e retorna a falta encontrada
    @Override
    public Falta findById(Long id) throws RuntimeException {
        return attendanceService.findById(id);
    }

    // Busca faltas pelo ID do aluno utilizando o serviço e retorna a lista de faltas encontradas
//    @Override
//    public List<Falta> findByStudentId(Long rg) throws RuntimeException {
//        return attendanceService.findByStudentId(rg);
//    }

    // Retorna uma lista com todas as faltas utilizando o serviço
    @Override
    public List<Falta> findAll() throws RuntimeException {
        return attendanceService.findAll();
    }
}
