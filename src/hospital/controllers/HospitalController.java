package hospital.controllers;

import hospital.models.Consulta;
import hospital.models.factory.Funcionario;
import hospital.models.Hospital;
import hospital.models.Paciente;

import java.util.ArrayList;

public final class HospitalController {
    private static HospitalController instance;
    private Hospital hospital;

    private HospitalController() {
        System.out.println("Iniciando o controle do hospital");
        hospital = new Hospital();
        hospital.setFuncionarios(new ArrayList<>());
        hospital.setPacientes(new ArrayList<>());
        hospital.setConsultas(new ArrayList<>());
    }

    public static HospitalController getInstance() {
        if (instance == null) {
            instance = new HospitalController();
        }
        return instance;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        hospital.getFuncionarios().add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso");
    }

    public void removerFuncionario(Funcionario funcionario) {
        hospital.getFuncionarios().remove(funcionario);
        System.out.println("Funcionário removido");
    }

    public void cadastrarPaciente(Paciente paciente) {
        hospital.getPacientes().add(paciente);
        System.out.println("Paciente cadastrado com sucesso");
    }

    public void removerPaciente(Paciente paciente) {
        hospital.getPacientes().remove(paciente);
        System.out.println("Paciente removido");
    }

    public void marcarConsulta(Consulta consulta) {
        hospital.getConsultas().add(consulta);
        System.out.println("Consulta marcada com sucesso");
    }

    public void cancelarConsulta(Consulta consulta) {
        hospital.getConsultas().remove(consulta);
        System.out.println("Consulta cancelada");
    }
}

