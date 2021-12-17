package br.com.enderecopaciente.endereco.controller;

import br.com.enderecopaciente.endereco.domain.Paciente;
import br.com.enderecopaciente.endereco.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {

    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/buscaremail")
    public String busca(Model model) {
        Paciente pac = pacienteService.buscaPorEmail(
                "alf.silva@email.com"
        );

        model.addAttribute("nome", pac.getNome());
        model.addAttribute("sobrenome", pac.getSobrenome());
        return "index";

    }

}
