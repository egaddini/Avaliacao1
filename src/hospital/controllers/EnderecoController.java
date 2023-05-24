package hospital.controllers;

import hospital.models.Endereco;

import java.util.ArrayList;

public final class EnderecoController {
    private static EnderecoController instance;
    private ArrayList<Endereco> enderecos;

    private EnderecoController() {
        System.out.println("Iniciando o controle de endereços");
        enderecos = new ArrayList<>();
    }

    public static EnderecoController getInstance() {
        if (instance == null) {
            instance = new EnderecoController();
        }
        return instance;
    }

    public void cadastrarEndereco(Endereco endereco) {
        enderecos.add(endereco);
        System.out.println("Endereço cadastrado com sucesso");
    }

    public void removerEndereco(Endereco endereco) {
        enderecos.remove(endereco);
        System.out.println("Endereço removido");
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
}

