package hospital.models;

import hospital.models.factory.Funcionario;

import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Funcionario funcionario;
    private LocalDateTime dataHora;
    private String motivo;
    private String diagnostico;
    private String prescricao;
    private boolean realizada;

    public Consulta() {
    }

    public Consulta(Paciente paciente, Funcionario funcionario, LocalDateTime dataHora, String motivo) {
        this.paciente = paciente;
        this.funcionario = funcionario;
        this.dataHora = dataHora;
        this.motivo = motivo;
        this.realizada = false; // Por padrão, a consulta é inicialmente marcada como não realizada
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Funcionario getMedico() {
        return funcionario;
    }

    public void setMedico(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "paciente=" + paciente +
                ", funcionario=" + funcionario +
                ", dataHora=" + dataHora +
                ", motivo='" + motivo + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", prescricao='" + prescricao + '\'' +
                ", realizada=" + realizada +
                '}';
    }
}

