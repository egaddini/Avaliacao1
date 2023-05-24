package hospital.builders;

import hospital.models.*;
import hospital.models.factory.Funcionario;

import java.util.List;

public class HospitalBuilder {
    private Hospital hospital;

    public HospitalBuilder() {
        hospital = new Hospital();
    }

    public HospitalBuilder endereco(Endereco endereco) {
        hospital.setEndereco(endereco);
        return this;
    }

    public HospitalBuilder caracteristicas(CaracteristicasEstruturais caracteristicas) {
        hospital.setCaracteristicas(caracteristicas);
        return this;
    }

    public HospitalBuilder funcionarios(List<Funcionario> funcionarios) {
        hospital.setFuncionarios(funcionarios);
        return this;
    }

    public HospitalBuilder pacientes(List<Paciente> pacientes) {
        hospital.setPacientes(pacientes);
        return this;
    }

    public HospitalBuilder consultas(List<Consulta> consultas) {
        hospital.setConsultas(consultas);
        return this;
    }

    public Hospital build() {
        return hospital;
    }

}

