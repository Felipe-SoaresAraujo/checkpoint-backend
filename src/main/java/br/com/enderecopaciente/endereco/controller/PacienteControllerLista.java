package br.com.enderecopaciente.endereco.controller;

import br.com.enderecopaciente.endereco.domain.Paciente;
import br.com.enderecopaciente.endereco.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class PacienteControllerLista {

    private final PacienteService pacienteService;

    @Autowired
    public PacienteControllerLista(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> getPaciente(){
        return pacienteService.listPaciente();
    }
}
