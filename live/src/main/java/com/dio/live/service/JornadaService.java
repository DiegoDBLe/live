package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class JornadaService {

    // No lugar de eu fazer JornadaRepository = new JornadaRepository a anotação
    // @Autowired já faz isso e precisa fazer um construtor e anotação vai no construtor

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    // Criando objeto para salvar
    public JornadaTrabalho saveJornada (JornadaTrabalho jornadaTrabalho){
       return jornadaRepository.save(jornadaTrabalho);
    }

    // Chamando a Lista vai retornar a lista
    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    // Chamando por id
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    // Atualizando
    public JornadaTrabalho updateJornada (JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    // Apagando pelo id
    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
