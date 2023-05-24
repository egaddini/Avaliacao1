package hospital.controllers;

import hospital.models.factory.Funcionario;

import java.util.ArrayList;
import java.util.List;

public final class FuncionarioController {
    private static FuncionarioController instance;
    private List<Funcionario> funcionarios;

    private FuncionarioController() {
        System.out.println("Iniciando o cadastro de funcionários");
        funcionarios = new ArrayList<>();
    }

    public static FuncionarioController getInstance() {
        if (instance == null) {
            instance = new FuncionarioController();
        }
        return instance;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso");
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
        System.out.println("Funcionário removido");
    }
}

