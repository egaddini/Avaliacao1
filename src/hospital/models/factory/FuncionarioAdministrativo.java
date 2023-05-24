package hospital.models.factory;

public class FuncionarioAdministrativo extends Funcionario {

    public FuncionarioAdministrativo() {
    }

    public FuncionarioAdministrativo(String nome, int idade, double salario, String departamento, String categoria) {
        super(nome, idade, salario, departamento, categoria);
    }
}

