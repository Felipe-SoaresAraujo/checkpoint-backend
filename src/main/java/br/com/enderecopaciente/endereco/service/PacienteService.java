package br.com.enderecopaciente.endereco.service;

import br.com.enderecopaciente.endereco.domain.Paciente;
import java.util.List;

public interface PacienteService {

    List<Paciente> listPaciente();
    Paciente buscaPorEmail(String email);
}
