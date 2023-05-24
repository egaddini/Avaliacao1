package hospital.builders;

import hospital.models.Paciente;

public class PacienteBuilder {
    private Paciente paciente;

    public PacienteBuilder() {
        paciente = new Paciente();
    }

    public PacienteBuilder nome(String nome) {
        paciente.setNome(nome);
        return this;
    }

    public PacienteBuilder idade(int idade) {
        paciente.setIdade(idade);
        return this;
    }

    public PacienteBuilder genero(String genero) {
        paciente.setGenero(genero);
        return this;
    }

    public PacienteBuilder matricula(int matricula) {
        paciente.setMatricula(matricula);
        return this;
    }

    public PacienteBuilder historicoMedico(String historicoMedico) {
        paciente.setHistoricoMedico(historicoMedico);
        return this;
    }

    public Paciente build() {
        return paciente;
    }

}

