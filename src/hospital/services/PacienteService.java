package hospital.services;

import hospital.builders.PacienteBuilder;
import hospital.models.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {
    public List<Paciente> getListaPacientes() {
        List<Paciente> pacientes = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Paciente paciente = new PacienteBuilder()
                    .nome("Paciente " + (i + 1))
                    .idade(20 + i)
                    .genero(i % 2 == 0 ? "Masculino" : "Feminino")
                    .matricula(1000 + i)
                    .historicoMedico("Histórico médico do paciente " + (i + 1))
                    .build();

            pacientes.add(paciente);
        }

        return pacientes;
    }
}

