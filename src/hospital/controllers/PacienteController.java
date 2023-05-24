package hospital.controllers;

import hospital.models.Paciente;

import java.util.ArrayList;

public final class PacienteController {
    private static PacienteController instance;
    private ArrayList<Paciente> pacientes;

    private PacienteController() {
        System.out.println("Iniciando o controle de pacientes");
        pacientes = new ArrayList<>();
    }

    public static PacienteController getInstance() {
        if (instance == null) {
            instance = new PacienteController();
        }
        return instance;
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente cadastrado com sucesso");
    }

    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
        System.out.println("Paciente removido");
    }

    public Paciente buscarPorMatricula(int matricula) {
        for (Paciente paciente : pacientes) {
            if (paciente.getMatricula() == matricula) {
                return paciente;
            }
        }
        return null;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
}
