package hospital.models;

import hospital.models.factory.Funcionario;

import java.util.List;

public class Hospital {

    private Endereco endereco;

    private CaracteristicasEstruturais caracteristicas;

    private List<Funcionario> funcionarios;

    private List<Paciente> pacientes;

    private List<Consulta> consultas;

    public Hospital() {
    }

    public Hospital(Endereco endereco, CaracteristicasEstruturais caracteristicas, List<Funcionario> funcionarios, List<Paciente> pacientes, List<Consulta> consultas) {
        this.endereco = endereco;
        this.caracteristicas = caracteristicas;
        this.funcionarios = funcionarios;
        this.pacientes = pacientes;
        this.consultas = consultas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public CaracteristicasEstruturais getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(CaracteristicasEstruturais caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "endereco=" + endereco +
                ", caracteristicas=" + caracteristicas +
                ", funcionarios=" + funcionarios +
                ", pacientes=" + pacientes +
                ", consultas=" + consultas +
                '}';
    }
}
