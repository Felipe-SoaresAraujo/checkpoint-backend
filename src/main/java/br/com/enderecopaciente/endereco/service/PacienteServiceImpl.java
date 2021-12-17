package br.com.enderecopaciente.endereco.service;

import br.com.enderecopaciente.endereco.domain.Endereco;
import br.com.enderecopaciente.endereco.domain.Paciente;
import br.com.enderecopaciente.endereco.util.UtilDate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    private Endereco end1 = new Endereco("SQS 406 conjunto B bloco D", "222", "Brasilia", "DF");

    private Paciente pac1 = new Paciente(
            1 ,"Alfredo", "Silva", "alf.silva@email.com", "123.456.789-12", UtilDate.dateToTimestampo(new Date()), end1);

    private Endereco end2 = new Endereco("SQSW 303 conjunto C bloco A", "312", "Brasilia", "DF");

    private Paciente pac2 = new Paciente(
            1 ,"Mariana", "Oliveira", "mari.oliveira@email.com", "321.654.987-09", UtilDate.dateToTimestampo(new Date()), end2) ;

    @Override
    public List<Paciente> listPaciente(){
        ArrayList<Paciente> paci = new ArrayList<>();
        paci.add(pac1);
        paci.add(pac2);

        for (Paciente p : paci){
            System.out.println(p);
        }

        return null;
    }

    public Paciente buscaPorEmail(String email){
        if (email.equalsIgnoreCase(pac1.getEmail()))
            return pac1;
        else if (email.equalsIgnoreCase(pac2.getEmail()))
            return pac2;

        return null;
    }

}
