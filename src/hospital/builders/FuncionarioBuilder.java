package hospital.builders;

import hospital.models.factory.Enfermeiro;
import hospital.models.factory.FuncionarioAdministrativo;
import hospital.models.factory.Medico;

public class FuncionarioBuilder {
    private String nome;
    private int idade;
    private double salario;
    private String departamento;
    private String categoria;

    public FuncionarioBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public FuncionarioBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public FuncionarioBuilder salario(double salario) {
        this.salario = salario;
        return this;
    }

    public FuncionarioBuilder departamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public FuncionarioBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public Medico buildMedico() {
        return new Medico(nome, idade, salario, departamento, categoria);
    }

    public Enfermeiro buildEnfermeiro() {
        return new Enfermeiro(nome, idade, salario, departamento, categoria);
    }

    public FuncionarioAdministrativo buildFuncionarioAdministrativo() {
        return new FuncionarioAdministrativo(nome, idade, salario, departamento, categoria);
    }
}

