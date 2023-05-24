package hospital.services;

import hospital.builders.ConsultaBuilder;
import hospital.models.Consulta;
import hospital.models.Paciente;
import hospital.models.factory.Funcionario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConsultaService {

    public List<Consulta> gerarNovasConsultas(List<Paciente> pacientes, List<Funcionario> medicos) {
        List<Consulta> consultas = new ArrayList<>();

        ConsultaBuilder consultaBuilder = new ConsultaBuilder();

        for (int i = 0; i < 10; i++) {
            Paciente paciente = pacientes.get(i % pacientes.size());
            Funcionario medico = medicos.get(i % medicos.size());
            LocalDateTime dataHora = LocalDateTime.now().plusDays(i);
            String motivo = "Consulta " + (i + 1);
            String diagnostico = "Diagnóstico " + (i + 1);
            String prescricao = "Prescrição " + (i + 1);
            boolean realizada = i % 2 == 0;

            Consulta consulta = consultaBuilder
                    .paciente(paciente)
                    .medico(medico)
                    .dataHora(dataHora)
                    .motivo(motivo)
                    .diagnostico(diagnostico)
                    .prescricao(prescricao)
                    .markAsRealizada(realizada)
                    .build();

            consultas.add(consulta);
        }

        return consultas;
    }

}

