package hospital.builders;

import hospital.models.Consulta;
import hospital.models.Paciente;
import hospital.models.factory.Funcionario;
import hospital.models.factory.Medico;

import java.time.LocalDateTime;

public class ConsultaBuilder {
    private Consulta consulta;

    public ConsultaBuilder() {
        consulta = new Consulta();
    }

    public ConsultaBuilder paciente(Paciente paciente) {
        consulta.setPaciente(paciente);
        return this;
    }

    public ConsultaBuilder medico(Funcionario funcionario) {
        consulta.setMedico(funcionario);
        return this;
    }

    public ConsultaBuilder dataHora(LocalDateTime dataHora) {
        consulta.setDataHora(dataHora);
        return this;
    }

    public ConsultaBuilder motivo(String motivo) {
        consulta.setMotivo(motivo);
        return this;
    }

    public ConsultaBuilder diagnostico(String diagnostico) {
        consulta.setDiagnostico(diagnostico);
        return this;
    }

    public ConsultaBuilder prescricao(String prescricao) {
        consulta.setPrescricao(prescricao);
        return this;
    }

    public ConsultaBuilder markAsRealizada(boolean realizada) {
        consulta.setRealizada(realizada);
        return this;
    }

    public Consulta build() {
        return consulta;
    }

}

